package sec01.exam04;

import java.util.Date;	// toString() 메소드를 재정의하여 현재 시스템의 날짜와 시간 정보 리턴

public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}

}
