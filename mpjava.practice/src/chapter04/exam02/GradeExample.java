package chapter04.exam02;

import java.util.Scanner;

public class GradeExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
		scanner.close();
		
		Grade me = new Grade(math, science, english);
		System.out.printf("평균은 %.3f\n", me.average());
	}

}
