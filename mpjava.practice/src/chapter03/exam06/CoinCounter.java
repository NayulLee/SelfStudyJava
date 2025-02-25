package chapter03.exam06;

import java.util.Scanner;

public class CoinCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int [] unit = {50000, 10000, 1000, 100, 10, 1};	// 환산할 돈의 종류
		int[] quotients = new int[unit.length];	// 몫을 저장할 배열
		
		System.out.print("금액을 입력하시오 >> ");
		int input = scanner.nextInt();
		
		for(int i = 0; i < unit.length; i++) {
			quotients[i] = input / unit[i];
			input %= unit[i];
		}
		
		for(int i = 0; i < unit.length; i++) {
			System.out.println(unit[i] + "원 짜리 : " + quotients[i] + "개");
		}
		scanner.close();
	}

}
