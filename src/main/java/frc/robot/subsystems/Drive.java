/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.Constants;

/**
 * The drive subsystem.  Controls the drivetrain on teh robot.
 */
public class Drive extends Subsystem {

    //motors
    CANSparkMax mLeftMaster = new CANSparkMax(Constants.kDriveLeftMaster, MotorType.kBrushless);
    CANSparkMax mRightMaster = new CANSparkMax(Constants.kDriveRightMaster, MotorType.kBrushless);
    CANSparkMax mLeftSlave = new CANSparkMax(Constants.kDriveLeftSlave, MotorType.kBrushless);
    CANSparkMax mRightSlave = new CANSparkMax(Constants.kDriveRightSlave, MotorType.kBrushless);
    
    Solenoid mShifer = new Solenoid(Constants.kShifter);


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
