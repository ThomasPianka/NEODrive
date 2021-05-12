// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drive extends SubsystemBase {
  private CANSparkMax leftMotor;
  private CANSparkMax rightMotor;
  private DifferentialDrive driveTrain;
  private static Drive drive;
  
  /**
   * Creates a new Drive.
   */
  public Drive() {
    MotorType brushless = MotorType.kBrushless;
    IdleMode coast = IdleMode.kCoast;

    leftMotor = new CANSparkMax(RobotMap.D_LEFT, brushless);
    rightMotor = new CANSparkMax(RobotMap.D_RIGHT, brushless);

    leftMotor.setIdleMode(coast);
    rightMotor.setIdleMode(coast);

    driveTrain = new DifferentialDrive(leftMotor, rightMotor);
  }

  public static Drive getInstance() {
    if (drive == null) {
      drive = new Drive();
    }
    return drive;
  }

  // Drive method
  public void drive(double leftSpeed, double rightSpeed) {
    driveTrain.tankDrive(leftSpeed, rightSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
