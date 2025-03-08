package sec01.verify.exam07;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		int index = str.indexOf("자바");
		/* String 메서드 indexOf()
		 * 매개값으로 주어진 문자열이 시작되는 인덱스를 리턴한다.
		 */
		if(index != -1) {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			/* String 메서드 replace()
			 * 첫 번째 매개값인 문자열을 차장 두 번째 매개값인 문자열로 대치한 새롱누 문자열을 생성하고 리턴한다.
			 * replace()가 리턴하는 문자열은 원래 문자열의 수정본이 아닌 완전히 새로운 문자열이다.
			 */
			String newStr = str.replace("자바", "JAVA");
			System.out.println(newStr);
		}
		else {
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
			
		}
	}

}
