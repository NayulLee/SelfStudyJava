package chapter03.exam04;

import java.util.Scanner;

public class nested2Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		  char alpha; // 입력값 검증 : 대문자, 숫자는 받지 않는다. 
		  do {
		  System.out.print("소문자 알파벳 하나를 입력하시오 >>"); 
		  alpha = scanner.next().charAt(0);
		  }while(Character.isUpperCase(alpha) || isUpperOrLower(alpha));
		  
		  scanner.close();
		 
		int n = (int)alpha - 97;
		
		for(int i = 0; i <= n; i++) {
			for(int j = n; j >= i; j--) {
				System.out.print((char)((int)alpha-j));
			}
			System.out.println();
		}
		
	}
	
	public static boolean isUpperOrLower(char c) {
		return !Character.isLetter(c);	// 알파벳인지를 확인한다.
	}

}
