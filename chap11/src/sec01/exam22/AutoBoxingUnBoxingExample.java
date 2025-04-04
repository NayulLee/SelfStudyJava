package sec01.exam22;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// 자동 박싱
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		System.out.println(obj.getClass().getName());
		System.out.println(obj instanceof Integer);
		
		// 대입 시 자동 언박싱
		int value = obj;
		System.out.println("value : " + value);
		
		// 연산 시 자동 언박싱
		int result = obj + 100;
		System.out.println("result : " + result);
	}

}
