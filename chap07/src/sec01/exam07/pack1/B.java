package sec01.exam07.pack1;

public class B {
	public void method() {
		// protected는 같은 패키지 안에서는 접근 가능
		A a = new A();
		a.field = "value";
		a.method();
	}
}
