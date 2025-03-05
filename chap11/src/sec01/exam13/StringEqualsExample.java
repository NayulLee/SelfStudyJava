package sec01.exam13;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = new String("이나율");
		String strVar2 = new String("이나율");
		
		if(strVar1 == strVar2) {
			System.out.println("같은 객체를 참조");
		}
		else {
			System.out.println("다른 객체를 참조");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		}else
		{
			System.out.println("다른 문자열을 가짐");
		}
	}

}
