package org.usfirst.frc.team4028.robot.subsystems;

import org.usfirst.frc.team4028.robot.RobotMap;
import org.usfirst.frc.team4028.robot.loops.Loop;


import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class Chassis implements Subsystem {
	private static final Chassis _instance = new Chassis();
	
	public static Chassis getInstance() {
		return _instance;
	}
	
	CANTalon _masterLeft;
	CANTalon _slaveLeft1;
	CANTalon _slaveLeft2;
	CANTalon _masterRight;
	CANTalon _slaveRight1;
	CANTalon _slaveRight2;
	
	DoubleSolenoid _pumaFront;
	DoubleSolenoid _pumaBack;
	DoubleSolenoid _gearBox;
	
	private Chassis(){
		
		 _masterLeft = new CANTalon(RobotMap.MASTER_LEFT_TALON_ADDRESS);
		 _slaveLeft1 = new CANTalon(RobotMap.SLAVE1_LEFT_TALON_ADDRESS);
		 _slaveLeft2 = new CANTalon(RobotMap.SLAVE2_LEFT_TALON_ADDRESS);
		 _masterRight = new CANTalon(RobotMap.MASTER_RIGHT_TALON_ADDRESS);
		 _slaveRight1 = new CANTalon(RobotMap.SLAVE1_RIGHT_TALON_ADDRESS);
		 _slaveRight2 = new CANTalon(RobotMap.SLAVE2_RIGHT_TALON_ADDRESS);
		 
		 _pumaFront = new DoubleSolenoid(0 , RobotMap.PUMAFRONT_FIRST_ADRESS, RobotMap.PUMAFRONT_FIRST_ADRESS );
		 _pumaBack = new DoubleSolenoid(0, RobotMap.PUMABACK_FIRST_ADRESS, RobotMap.PUMABACK_SECOND_ADRESS);
		 _gearBox = new DoubleSolenoid(0, RobotMap.GEARBOX_FIRST_ADRESS, RobotMap.GEARBOX_SECOND_ADRESS);
		
		 _slaveLeft1.changeControlMode(CANTalon.TalonControlMode.Follower);
		 _slaveLeft2.changeControlMode(CANTalon.TalonControlMode.Follower);
		  _slaveLeft1.set(RobotMap.MASTER_LEFT_TALON_ADDRESS);
		 _slaveLeft2.set(RobotMap.MASTER_LEFT_TALON_ADDRESS);
		 
		 _slaveRight1.changeControlMode(CANTalon.TalonControlMode.Follower);
		 _slaveRight2.changeControlMode(CANTalon.TalonControlMode.Follower);
		 _slaveRight1.set(RobotMap.MASTER_RIGHT_TALON_ADDRESS);
		 _slaveRight2.set(RobotMap.MASTER_RIGHT_TALON_ADDRESS);
		
		 _masterRight.reverseSensor(true);
		}
	

	
	private final Loop _loop = new Loop() {
		@Override
		public void onStart(double timestamp) {
			stop();
		}

		@Override
		public void onLoop(double timestamp) {
			// TODO Auto-generated method stub
		}

		@Override
		public void onStop(double timestamp) {
			stop();
		}
	};
	
	public Loop getLoop() {
		return _loop;
	}
	
	public void arcadeDrive(double throttle, double turn){
		_masterLeft.set(-throttle - 0.7 * turn);
		_masterRight.set(-throttle + -0.7 * turn);
		
	}
		
	public void shiftGear() {
		if (_gearBox.get() == Value.kForward) {
			_gearBox.set(Value.kReverse);
		} else {
			_gearBox.set(Value.kForward);
		}
	}
	
	public void shiftPumaFront() {
		if (_pumaFront.get() == Value.kForward) {
			_pumaFront.set(Value.kReverse);
		} else {
			_pumaFront.set(Value.kForward);
		}
	}
	
	public void shiftPumaBack() {
		if (_pumaBack.get() == Value.kForward) {
			_pumaBack.set(Value.kReverse);
		} else {
			_pumaBack.set(Value.kForward);
		}
	}

	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zeroSensors() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void outputToSmartDashboard() {
		// TODO Auto-generated method stub
		
	}}