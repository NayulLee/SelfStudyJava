package sec01.exam08;

class Parent{}

class Child extends Parent{}

public class ClassExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clazz = Child.class;
		
		System.out.println("클래스 이름 : " + clazz.getName());
		System.out.println("단순 클래스 이름 : " + clazz.getSimpleName());
		System.out.println("부모 클래스 : " + clazz.getSuperclass());

	}

}
