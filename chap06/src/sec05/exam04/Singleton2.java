package sec05.exam04;

public class Singleton2 {
	private static Singleton2 instance;
	
	private Singleton2() {
		System.out.println("객체가 생성되었습니다.");
	}
	
	public static Singleton2 getInstance() {
		if(instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}

