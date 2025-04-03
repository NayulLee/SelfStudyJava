package sec01.exam23;

public class TimeCompareStrimgbufferBtnString {
	
	
	public static void main(String[] args) {
		long time1 = System.nanoTime(); // System.currentTimeMillis();도 가능
		
		String str1 = "";
		for(int i = 0; i < 10000; i++) {
			str1 = str1 + "*";
		}
		
		long time2 = System.nanoTime();
		System.out.println("첫 번째 반복문 소요시간 : " + (time2 - time1));
		
		time1 = System.nanoTime();
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 10000; i++) {
			sb.append("*");
		}
		String str2 = sb.toString();
		
		time2 = System.nanoTime();
		System.out.println("두 번째 반복문 소요시간 : " + (time2 - time1));
		
		if(str1.equals(str2))
			System.out.println("str1 == str2");
	}

}
