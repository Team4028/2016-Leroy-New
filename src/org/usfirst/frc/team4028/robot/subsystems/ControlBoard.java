package org.usfirst.frc.team4028.robot.subsystems;
import org.usfirst.frc.team4028.robot.LogitechF310;
import org.usfirst.frc.team4028.robot.util.*;
import edu.wpi.first.wpilibj.Joystick;

public class ControlBoard {
	private static final ControlBoard _instance = new ControlBoard();
	
	public static ControlBoard getInstance() {
		return _instance;
	}
	
	Joystick _driver;
	Joystick _operator;
	
	
	private ControlBoard(){
		_driver = new Joystick(0);
		_operator = new Joystick(1);
	}         
	
	
	private LatchedBoolean _pumaFront = new LatchedBoolean();
	private LatchedBoolean _pumaBack = new LatchedBoolean();
	private LatchedBoolean _isHighGear = new LatchedBoolean();
	
	public boolean pumaFrontJustPress(){
		return _pumaFront.isJustPressed(_driver.getRawButton(LogitechF310.LEFT_BUMPER));
	}
	
	public boolean pumaBackJustPress(){
		return _pumaBack.isJustPressed(_driver.getRawButton(LogitechF310.RIGHT_BUMPER));
	}
	
	public boolean gearBoxJustPress(){
		return _isHighGear.isJustPressed(_driver.getRawButton(LogitechF310.START_BUTTON));
	}
	
	
	
	

}