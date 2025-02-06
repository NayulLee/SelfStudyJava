package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setSpeed(-50); // speed = 0;
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) // isStop이 false일경우 setStop()으로 stop시킨다.
			myCar.setStop();
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}

}
