package sec05.exam04;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return instance;
	}
}
