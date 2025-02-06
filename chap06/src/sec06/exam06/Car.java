package sec06.exam06;

public class Car {
	private int speed;
	private boolean stop; // boolean 초기값은 false
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}
		else
			this.speed = speed;
	}
	
	public boolean isStop() {	
		return stop; // 멈췄으면 true, 안멈췄으면 false
	}
	
	public void setStop() {
		this.stop = true;
		this.speed = 0;
	}
}
