package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		Parent parent = child; // 객체 자체는 Child 타입이지만, parent 변수는 Parent 타입으로 동작한다.
		parent.method1();		// 업캐스팅된 변수는 일반적으로 부모클래스의 멤버만을 이용할 수 있다.
		parent.method2();		// 자바에서 오버라이딩 된 메서드는 항상 동적 바인딩을 적용받기 때문에 변수이 타입에 관계 없이 실제 객체 타입을 기준으로 메서드 실행.
		/*
		parent.method3(); // 호출 불가능. Child 클래스에 추가적인 필드나 메서드가 있어도 업캐스팅 된 상태에서는 접근 x
		*/
	}

}
