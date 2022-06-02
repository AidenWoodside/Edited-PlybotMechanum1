package org.usfirst.frc.team5414.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;



//hello my name is aiden I am testing the changes within github


	//Buttons for Joystick
	public static int BtnButterfly= 1;
	public static int BtnLight= 3;
	public static int BtnHalf= 2;
	public static int BtnVision = 4;
	public static int BtnClimber = 5;
	public static int BtnStop = 6;
	public static int BtnCollectGear = 11; //Will intake and raise the assembly with limit switch
	public static int BtnCollectGearLower = 12; //will lower the arm assembly at set speed no limitswitch
	
	//shooter PID loop
	public static double ShooterkP = 0;
	public static double ShooterkI = 0;
	public static double ShooterkD = 0;
	public static double shootSpeed = 0.5;
	
	//Driving ports
	public static int PWMRightFrontMotor = 2;
	public static int PWMRightBackMotor = 3;
	public static int PWMLeftFrontMotor = 0;
	public static int PWMLeftBackMotor = 1;
	
	//Shooter port
	public static int PDPShooter = 3;
	
	//pwm for collector wheels & arms
	public static int PWMGearWheels = 4;
	public static int PWMGearArm = 5;
	
	//arm & collector speeds
	public static double armRaiseSpeed = 0.4;
	public static double armLowerSpeed = -0.4;
	public static double intakeSpeed = 0.5;
	public static double outtakeSpeed = -0.5;
	
	//climber stuffs
	public static int PWMlifter = 6;
	public static int PDPclimber = 2;
	public static int climberCurrentSpike = 64;
	public static double lifterholdspeed = -0.4;
	public static double lifterLiftSpeed = -1.0;
	
	//Autonomous settings
	public static double  goToPegSpeed= -.4;
	
	//Servo Ports
	public static int ServoPort = 8;  //Set to correct Port for servos for climber
	public static int ServoPort2 = 9; //Set to correct Port for servos for climber
	
	//Limit switch port
	public static int LimitInput = 0;  //Set limit to the digitalInput
	
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
