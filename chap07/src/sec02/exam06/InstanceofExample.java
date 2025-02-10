package sec02.exam06;

public class InstanceofExample {

	public static void method1(Parent parent) { // Child 타입으로 변환이 가능한지 확인
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method1 - Child로 변환 성공");
		}else {
			System.out.println("method2 - Child로 변환되지 않음.");
		}
		}
		
	public static void method2(Parent parent) {
		Child child = (Child)parent; // ClassCastExeption(런타임에러)가 발생할 가능성 있음
		System.out.println("method2 - Child로 변환 성공");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child();	// 업캐스팅
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();	// 업캐스팅X
		method1(parentB);
		method2(parentB); // 런타임 에러 발생
		
			}
}
