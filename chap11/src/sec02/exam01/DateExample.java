package sec02.exam01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); // 현재 날짜
		System.out.println(today);
		
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY년 MM월 dd일 HH시 mm분 ss초");
		String formattedDate = now.format(formatter);
		System.out.println(formattedDate);
	}
	
	
}
