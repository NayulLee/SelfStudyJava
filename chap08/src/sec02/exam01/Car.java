package sec02.exam01;

public class Car {
	Tire frontLeftTire = new HanKookTire();
	Tire frontRightTire = new HanKookTire();
	Tire backLeftTire = new HanKookTire();
	Tire backRightTire = new HanKookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
