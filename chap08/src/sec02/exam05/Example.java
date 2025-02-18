package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC impl = new ImplementationC();	// 하위인터페이스 C 구현클래스 ImplementationC 객체생성
		
		InterfaceA ia = impl;	 // 하위 C -> 상위 A (업캐스팅)
		ia.methodA();			 // methodA() 만 사용가능
		System.out.println();
		
		InterfaceB ib = impl;	 // 하위 C -> 상위 B (업캐스팅)
		ib.methodB();			 // methodB() 만 사용가능
		System.out.println();
		
		InterfaceC ic = impl;	
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
