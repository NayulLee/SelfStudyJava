package sec01.exam03;

public class Computer extends Calculator{
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCicle() 실행");
		return Math.PI * r * r;
	}
}
