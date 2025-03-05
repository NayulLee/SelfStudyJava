package sec01.exam08;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
class Sample{
	public int val1;
	public int val2;
	private int val3;
	
	public void display1() {
		System.out.println("Hello, Java!");
	}
	
	public void display2() {}
	
	private void display3() {}
}
public class ClassExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clazz = Sample.class;
		
		// 필드 정보 출력
		Field[] fields = clazz.getDeclaredFields();
		System.out.print("필드 목록 : ");
		
		for(Field field : fields) {
			System.out.print(" " + field.getName());
		}
		
		System.out.println();
		
		// 메서드 정보 출력
		Method[] methods = clazz.getDeclaredMethods();
		System.out.print("메서드 목록 : ");
		for(Method method : methods) {
			System.out.print(" " + method.getName());
		}
	}

}
