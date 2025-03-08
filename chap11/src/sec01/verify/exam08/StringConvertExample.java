package sec01.verify.exam08;

public class StringConvertExample {

	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		System.out.println(((Integer)intData1).getClass().getName());
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		System.out.println(strData2 instanceof String);
	}

}
