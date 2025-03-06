package sec01.exam22;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		Integer obj1 = new Integer(100); // 기본타입 100을 객체 Integer로 변환
		Integer obj2 = new Integer("200"); // 문자열 200을 기본 타입의 객체로 변환
		Integer obj3 = Integer.valueOf("300");	// 문자열 300을 기본 타입의 객체 Integer로 변환
		
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
	}

}
