// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.OI;
import frc.robot.subsystems.Drive;
import frc.robot.input.AttackThree;
import frc.robot.input.AttackThree.AttackThreeAxis;
import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * A DefaultDrive command that passes joystick input to a tank drive drivetrain.
*/
public class DefaultDrive extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final AttackThreeAxis yAxis = AttackThreeAxis.kY;
  private final Drive m_drive;
  private static OI oi;

  /**
   * Creates a new DefaultDrive.
   *
   * @param drive The subsystem used by this command.
   */
  public DefaultDrive(Drive drive) {
    m_drive = drive;
    oi = OI.getInstance();
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    AttackThree leftJoystick = oi.getLeftStick();
    AttackThree rightJoystick = oi.getRightStick();
    double leftJoystickSpeed = -leftJoystick.getAxis(yAxis);
    double rightJoystickSpeed = -rightJoystick.getAxis(yAxis);
    m_drive.drive(leftJoystickSpeed, rightJoystickSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
