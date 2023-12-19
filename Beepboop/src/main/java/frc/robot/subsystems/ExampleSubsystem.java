// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
private final CANSparkMax m_blMotor = new CANSparkMax(4, MotorType.kBrushless);
MotorControllerGroup m_left = new MotorControllerGroup(m_flMotor, m_blMotor);
private final CANSparkMax m_frMotor = new CANSparkMax(1, MotorType.kBrushless);
private final CANSparkMax m_brMotor = new CANSparkMax(2, MotorType.kBrushless);
MotorControllerGroup m_right = new MotorControllerGroup(m_frMotor, m_brMotor);

private final RelativeEncoder m_leftEncoder = m_flMotor.getEncoder();
private final RelativeEncoder m_rightEncoder = m_frMotor.getEncoder();
private final RelativeEncoder m_leftBackEncoder = m_blMotor.getEncoder();
private final RelativeEncoder m_rightBackEncoder = m_brMotor.getEncoder();

// Set up the differential drive controller
private final DifferentialDrive m_diffDrive = new DifferentialDrive(m_left, m_right);

private double balancePosition;

public Drivetrain() {
  m_flMotor.setIdleMode(IdleMode.kBrake);
  m_blMotor.setIdleMode(IdleMode.kBrake);
  m_frMotor.setIdleMode(IdleMode.kBrake);
  m_brMotor.setIdleMode(IdleMode.kBrake);
   // We need to invert one side of the drivetrain so that positive voltages result in both sides moving forward. Depending on how your robot's gearbox is constructed, you might have to invert the left side instead.
  rightControllerGroup.setInverted(true);
  leftControllerGroup.setInverted(false);
  m_brMotor.setInverted(true);
  m_frMotor.setInverted(true);
  m_leftEncoder.setPositionConversionFactor(Constants.K_WHEEL_DIAMETER_INCH);
  m_rightEncoder.setPositionConversionFactor(Constants.K_WHEEL_DIAMETER_INCH);
  m_leftBackEncoder.setPositionConversionFactor(Constants.K_WHEEL_DIAMETER_INCH);
  m_rightBackEncoder.setPositionConversionFactor(Constants.K_WHEEL_DIAMETER_INCH);
  public void arcadeDrive(double fwd, double rot) {
    differentialDrive.arcadeDrive(fwd, rot);
  }
  resetEncoders();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}