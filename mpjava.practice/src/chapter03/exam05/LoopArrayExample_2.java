package chapter03.exam05;

import java.util.Scanner;

public class LoopArrayExample_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] intArray = new String[10];
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.print((i + 1) + "번째 양수 입력 >> ");
			intArray[i] = scanner.next();	// 예외처리를 사용하지 않고 입력된 값이 양수인지 판단하기 위해 String으로 받는다.
			if(intArray[i].matches("-?\\d+")) {
				// 1. 입력받은 값이 숫자인지 확인 : matches()
				if(Integer.parseInt(intArray[i]) > 0 ) {
				// 2. 입력받은 값이 양수인지 확인 : parseInt
				}
				else {
					System.out.println("잘못된 값 입력");
					i--;
				}
			}
			else {
				System.out.println("잘못된 값 입력");
				i--;
			}
			
		}
		System.out.print("3의 배수는 >> ");

		for(int i = 0; i < intArray.length; i++) {
			if(Integer.parseInt(intArray[i]) % 3 == 0) {
				System.out.print(intArray[i] + " ");
			}
		}
	}

}
