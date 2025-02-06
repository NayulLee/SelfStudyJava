package sec06.exam04.package1;

public class B {
	A a1 = new A(true); // public 생성자 - 전부 가능
	A a2 = new A(1);	// default 생성자 - 같은 패키지 내에서 가능
	// A a3 = new A("문자열");	// private 생성자 - 같은 클래스 내에서 가능(컴파일 오류)
}
