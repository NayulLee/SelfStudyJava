package sec01.exam05;

public class Car {
	public int speed;
	
	public void speedUp() {speed = 1;}
	
	// 메소드에 final 키워드를 붙이면 이 메소드는 최종적인 메소드이므로 재정의할 수 없는 메소드가 된다.
	public final void stop() {
		System.out.println("차를 멈춤.");
		speed = 0;
	}
}
