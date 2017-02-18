package org.usfirst.frc.team5414.robot.subsystems;

import org.usfirst.frc.team5414.robot.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Servo1 extends Subsystem {

    public Servo servo,servo2;

	public void initDefaultCommand() {
        servo = new Servo(RobotMap.ServoPort);
        servo2 = new Servo(RobotMap.ServoPort2);//DON'T FORGET TO CHANGE PORT #!
    }
	
	public void setAngle(double degrees)
	{
		servo.setAngle(degrees);		//may have to inverse depending on which servo is which
		servo2.setAngle(-degrees);
	}
	
	public void Zero()
	{
		servo.setAngle(0);
		servo2.setAngle(0);
	}
	
}

