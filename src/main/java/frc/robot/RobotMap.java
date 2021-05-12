// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  /* 
   * List of CAN IDs
   * The unused IDs are commented out to prevent an overwhelming amount of warnings
   */
	// private final static int CAN_0 = 0;
	// private final static int CAN_1 = 1;
	// private final static int CAN_2 = 2;
	private final static int CAN_3 = 3;
	private final static int CAN_4 = 4;
	// private final static int CAN_5 = 5;
	// private final static int CAN_6 = 6;
	// private final static int CAN_7 = 7;
	// private final static int CAN_8 = 8;
	// private final static int CAN_9 = 9;
	// private final static int CAN_10 = 10;
	// private final static int CAN_11 = 11;
	// private final static int CAN_12 = 12;
	// private final static int CAN_13 = 13;
	// private final static int CAN_14 = 14;
  // private final static int CAN_15 = 15;

	//[D]rive
  public static final int D_LEFT = CAN_3;
  public static final int D_RIGHT = CAN_4;

  //[U]ser Input
	public static final int U_JOYSTICK_LEFT = 0;
	public static final int U_JOYSTICK_RIGHT = 1;
}
