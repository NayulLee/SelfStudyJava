package sec01.exam23;

public class StringExam {
	
	public static void main(String[] args) {
		
	
	String str1 = "Hello World";
	String str2 = str1.substring(5);
	
	System.out.println(str1);
	System.out.println(str2);
	
	String str3 = str1 + str2;
	System.out.println(str3);
	
	// 문자열과 문자열을 더하는 연산이 실제로는 StringBuffer()메서드를 호출하여 StringBuffer를 만들고,
	// 요소를 append()로 붙여준 뒤 toString()메서드를 이용하여 String객체로 변환해준다.
	// toString()은 원래 객체의 메모리 주소를 문자열로 반환하는 Object클래스의 메서드이다.
	// StringBuffer클래스에서 오버라이딩 된 상태
	String str4 = new StringBuffer().append(str1).append(str2).toString();
	System.out.println(str4);
	
	String str5 ="";
	for(int i = 0; i < 100; i++) {
		str5 = str5 + "*";
	} // 실제 반복문 안에서 문자가 더해질때마다 100번동안 내부적으로 String 객체를 만들어 내는 것.
	// 자바는 new연산자가 많이 사용될수록 프로그램의 속도가 느려지므로 좋은 코드는 아니다.
	System.out.println(str5);
	
	
	StringBuffer sb = new StringBuffer();
	for(int i = 0; i < 100; i++) {
		sb.append("*");
	}
	String str6 = sb.toString();
	System.out.println(str6);
	// String객체에 +연산자를 이용하는 것보다, StringBuffer클래스를 이용하여 append()메서드를 사용하는게 더 낫다.
	// 문자열을 반복문 안에서 사용하는건 성능 상으로 문제를 일으킬 수 있기 때문에 반드시 피한다.
}
}
