package sec01.verify.exam06;

public class BytesToStringExample {

	public static void main(String[] args) {
		byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		// 각 원소는 1바이트 크기로 전환되어 배열에 저장된다.
		String str = new String(bytes);
		/* String의 기본 생성자 오버로딩
		 * new String(arr) : 문자 배열을 받아 이어붙여 문자열 객체 생성
		 * bytes를 매개변수로 받아 String 객체 str객체 생성
		 * 각 원소는 문자 인코딩(UTF-8)에 따라 문자열로 변환
		 */
		System.out.println(str);
		// i love you
	}

}
