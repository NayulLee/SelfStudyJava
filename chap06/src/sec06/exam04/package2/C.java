package sec06.exam04.package2;

import sec06.exam04.package1.A; // import문 써도 접근제한자 걸리면 못쓰는거다

public class C {
	A a1 = new A(true);		// public이라 다 가능
	//A a2 = new A(1);		// default 생성자 - 같은 패키지 내에서만 가능
	//A a3 = new A("문자열");	// private 생성자 - 같은 클래스 내에서만 가능
}
