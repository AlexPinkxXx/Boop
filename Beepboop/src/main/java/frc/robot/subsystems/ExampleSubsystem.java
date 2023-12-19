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

public class Drivetrain extends SubsystemBase 
{
  private final CANSparkMax m_flMotor = new CANSparkMax(3, MotorType.kBrushless);
  private final CANSparkMax m_blMotor = new CANSparkMax(4, MotorType.kBrushless);
  MotorControllerGroup m_left = new MotorController Group(m_fl, m_blMotor);
  private final CANSparkMax m_frMotor = new CANSparkMax(1, MotorType.kBrushless);
  private final CANSparkMax m_brMotor = new CANSparkMax(2, MotorType.kBrushless);

  
}