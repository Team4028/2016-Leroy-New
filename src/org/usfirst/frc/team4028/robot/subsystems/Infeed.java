package org.usfirst.frc.team4028.robot.subsystems;

import org.usfirst.frc.team4028.robot.loops.Loop;

public class Infeed implements Subsystem {
	private static final Infeed _instance = new Infeed();
	
	public static Infeed getInstance() {
		return _instance;
	}
	
	private Infeed(){
	}
	
	private final Loop _loop = new Loop() {
		@Override
		public void onStart(double timestamp) {
			// TODO Auto-generated method stub
		}

		@Override
		public void onLoop(double timestamp) {
			// TODO Auto-generated method stub
		}

		@Override
		public void onStop(double timestamp) {
			// TODO Auto-generated method stub
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