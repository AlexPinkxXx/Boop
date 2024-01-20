// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants;
// import com.revrobotics.CANSparkMax;
// import com.revrobotics.RelativeEncoder;
// import com.revrobotics.CANSparkMax.IdleMode;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  private final Spark m_flMotor = new Spark(15);
  private final Spark m_blMotor = new Spark(2);
  MotorControllerGroup m_left = new MotorControllerGroup(m_flMotor, m_blMotor);
  private final Spark m_frMotor = new Spark(14);
  private final Spark m_brMotor = new Spark(0);
  MotorControllerGroup m_right = new MotorControllerGroup(m_frMotor, m_brMotor);

  // private final RelativeEncoder m_leftEncoder = m_flMotor.getEncoder();
  // private final RelativeEncoder m_rightEncoder = m_frMotor.getEncoder();
  // private final RelativeEncoder m_leftBackEncoder = m_blMotor.getEncoder();
  // private final RelativeEncoder m_rightBackEncoder = m_brMotor.getEncoder();

  // Set up the differential drive controller
  private final DifferentialDrive m_diffDrive = new DifferentialDrive(m_left, m_right);

  private double balancePosition;

  public void arcadeDrive(double fwd, double rot) {
    m_diffDrive.arcadeDrive(fwd * 0.3, rot);
  }

  // public void resetEncoders() {
  // m_leftEncoder.setPosition(0);
  // m_rightEncoder.setPosition(0);
  // m_leftBackEncoder.setPosition(0);
  // m_rightBackEncoder.setPosition(0);
  // }

  public Drivetrain() {

    // m_flMotor.setIdleMode(IdleMode.kBrake);
    // m_blMotor.setIdleMode(IdleMode.kBrake);
    // m_frMotor.setIdleMode(IdleMode.kBrake);
    // m_brMotor.setIdleMode(IdleMode.kBrake);
    // We need to invert one side of the drivetrain so that positive voltages result
    // in both sides moving forward. Depending on how your robot's gearbox is
    // constructed, you might have to invert the left side instead.

    m_right.setInverted(true);
    m_left.setInverted(false);
    // m_brMotor.setInverted(true);
    // m_frMotor.setInverted(true);

    // m_leftEncoder.setPositionConversionFactor(Constants.K_WHEEL_DIAMETER_INCH);
    // m_rightEncoder.setPositionConversionFactor(Constants.K_WHEEL_DIAMETER_INCH);
    // m_leftBackEncoder.setPositionConversionFactor(Constants.K_WHEEL_DIAMETER_INCH);
    // m_rightBackEncoder.setPositionConversionFactor(Constants.K_WHEEL_DIAMETER_INCH);
    // ^line 47( I think ).

    // resetEncoders();
  }

  // public CANSparkMax getTestMotor()
  // {
  // return m_brMotor;
  // }

  public void runTest(double speed) {
    m_brMotor.set(speed);
    m_frMotor.set(speed);
    m_blMotor.set(speed);
    m_flMotor.set(speed);

  }

  public void stopMotors() {
    m_diffDrive.arcadeDrive(0, 0);
  }
  // public RelativeEncoder getLeftEncoder()
  // {
  // return m_leftEncoder;
  // }
  // public RelativeEncoder getRightEncoder()
  // {
  // return m_rightEncoder;
  // }
  // public RelativeEncoder getRightBEncoder()
  // {
  // return m_rightBackEncoder;
  // }
  // public RelativeEncoder getLeftBEncoder()
  // {
  // return m_leftBackEncoder;
  // }
  // public double getLeftDistanceInch()
  // {
  // return m_leftBackEncoder.getPosition();
  // }
  // public double getRightDistanceInch()
  // {
  // return m_rightEncoder.getPosition();
  // }
  // public double getRightBDistanceInch()
  // {
  // return m_rightBackEncoder.getPosition();
  // }
  // public double getLeftBDistanceInch()
  // {
  // return m_leftBackEncoder.getPosition();
  // }
  // ^line 47( I think ).
}
