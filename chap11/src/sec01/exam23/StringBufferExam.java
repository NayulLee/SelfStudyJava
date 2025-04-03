package sec01.exam23;

public class StringBufferExam {
	
	public static void main(String[] args) {
		
	StringBuffer sb = new StringBuffer();
	sb.append("hello");
	sb.append(" ");
	sb.append("world");
	
	// StringBuffer가 가지고 있는 메서드들은 대부분 자기 자신을 반환한다.
	String str = sb.toString(); 
	System.out.println(str);
	
	StringBuffer sb2 = new StringBuffer();
	StringBuffer sb3 = sb2.append("Hello");
	
	if(sb2 == sb3)
		System.out.println("sb2 == sb3");
	// append()는 this를 반환한다. 자기 자신 객체의 주소를 반환하는 것, 따라서 주소값을 비교하는 == 일 때 true
	// 메서드 체이닝(Method Chaining)
	// : 자기 자신을 리턴하는것을 이용하여 자기 자신의 메서드를 호출하면서 값을 바꿔나가는 방식
	
	// 메서드 체이닝 예제
	String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
	System.out.println(str2);
	}
}
