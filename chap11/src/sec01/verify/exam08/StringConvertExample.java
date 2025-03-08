package sec01.verify.exam08;


public class StringConvertExample {

	public static void printType(int value) {
		System.out.println(value + "는 int 타입입니다.");
	}
	
	public static void printType(Integer value) {
		System.out.println(value + "는 Integer 타입입니다.");
	}
	
	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		System.out.println(((Integer)intData1).getClass().getName());
		printType(intData1);
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		System.out.println(strData2 instanceof String);
	}

}
