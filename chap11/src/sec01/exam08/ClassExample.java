package sec01.exam08;

import sec01.exam01.*;
import sec01.exam02.*;

public class ClassExample {

	public static void main(String[] args) {
		// 객체 없이 클래스 이름만 가지고 Class 객체 얻기
		Class clazz1 = Member.class;
		
		try {
			// 클래스 로딩 전에 로드 경로 출력
			String className = "sec01.exam02.Key";
			System.out.println("클래스를 로드하려는 경로 : " + className);
			
			// class.forName() 호출
			Class<?> clazz = Class.forName(className);
			
			System.out.println("클래스 로드 성공 : " + clazz.getName());
		}catch(ClassNotFoundException e){
			System.out.println("클래스 로드 실패");
			e.printStackTrace();
		}
		
		Key key = new Key(123);
		Class clazz3 = key.getClass();
	}

}
