package sec01.exam24;

public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
		
		try {
		int value1 = Integer.parseInt("100");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
		
		}catch(NumberFormatException e) {
			System.out.println("변환 실패");
			System.out.println(e.getStackTrace());
		}
		
		
	}

}
