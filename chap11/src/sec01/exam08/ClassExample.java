package sec01.exam08;

public class ClassExample throw Exception{

	public static void main(String[] args) {
		Class clazz1 = Car.class;
		
		Class clazz2 = Class.forName("sec01.exam08.Car");
		
		Car car = new Car();
		Class clazz3 = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
