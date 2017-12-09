package org.usfirst.frc.team4028.robot;

import org.usfirst.frc.team4028.robot.loops.Looper;
import org.usfirst.frc.team4028.robot.subsystems.*;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot {
	Chassis _chassis = Chassis.getInstance();
	Infeed _infeed = Infeed.getInstance();
	Shooter _shooter = Shooter.getInstance();
	
	ControlBoard _controlBoard = ControlBoard.getInstance();
	
	Looper _enabledLooper = new Looper();
	
	@Override
	public void robotInit() {
		_enabledLooper.register(_chassis.getLoop());
		_enabledLooper.register(_infeed.getLoop());
		_enabledLooper.register(_shooter.getLoop());                
	}
	
	@Override
	public void disabledInit() {
		
	}

	@Override
	public void disabledPeriodic() {
		
	}

	@Override
	public void autonomousInit() {
		
	}

	@Override
	public void autonomousPeriodic() {
		
	}

	@Override
	public void teleopInit() {
		
	}

	@Override
	public void teleopPeriodic() {
		
	}
	
	public void stopAll(){
		
	}
}