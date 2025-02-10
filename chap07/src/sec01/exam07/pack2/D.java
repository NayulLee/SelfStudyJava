package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A{
	// 클래스 D의 경우 A와 다른 패키지에 있지만 자식클래스기 때문에 접근이 가능하다.
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}
