package sec01.verify.exam03;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		// Student 키로 총점 저장 HashMap 객체 생성
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		hashMap.put(new Student("1"), "95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생 총점 : " + score);
		
	}

}
