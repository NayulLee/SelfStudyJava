package sec05.exam04;

public class Singleton2Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton2 ex1 = Singleton2.getInstance();
		Singleton2 ex2 = Singleton2.getInstance();
		
		if(ex1 == ex2)
			System.out.println("같은 객체입니다.");
		else
			System.out.println("다른 객체입니다.");
	}

}
