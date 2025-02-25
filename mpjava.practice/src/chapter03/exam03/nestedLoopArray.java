package chapter03.exam03;

import java.util.Scanner;

public class nestedLoopArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 입력값 검증 : 0 이하의 값은 받지 않는다.
		int num = 0;
		do {
			System.out.print("정수를 입력하세요 >> ");
			num = scanner.nextInt();
		} while (num <= 0); // 1 이상의 정수만 받는다.

		int intArray[][] = new int[num][]; // 배열이 실제로 사용되지 않으므로 삭제해도 무방하다,

		for (int i = 0; i < intArray.length; i++) {
			for (int j = num; j - i > 0; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
