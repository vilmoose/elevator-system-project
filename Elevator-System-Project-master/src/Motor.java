/*
 * class responsible for setting the motor of the elevator on and off 
 * 
 * @author z, vilmos
 */

public class Motor {

	private boolean motorOperating;

	public Motor() {
		this.motorOperating = false;
	}

	/**
	 * Turns on the motor
	 */
	public synchronized void motorsOn() {
		motorOperating = true;
	}

	/**
	 * Turns motors off
	 */
	public synchronized void motorOff() {
		motorOperating = false;
		notifyAll();
	}

	public boolean isMotorOperating() {
		return motorOperating;
	}

}
