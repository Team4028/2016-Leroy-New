package org.usfirst.frc.team4028.robot.subsystems;

import org.usfirst.frc.team4028.robot.loops.Loop; 

public class Shooter implements Subsystem{
	private static final Shooter _instance = new Shooter();
	
	public static Shooter getInstance() {
		return _instance;
	}
	
	
	
	private Shooter (){
		}
	
	private final Loop _loop = new Loop(){
		public void onStart(double timestamp) {
			stop()   ;
		}
		
		public void onLoop(double timestamp){
			
		}
		
		public void onStop(double timestamp){
			stop();
		}
	};
	

	public Loop getLoop() {
		return _loop;
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
		
	}
}