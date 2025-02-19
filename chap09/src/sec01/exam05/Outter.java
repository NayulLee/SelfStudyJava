package sec01.exam05;

public class Outter {
	String field = "Outter - field";

	void method() {
		System.out.println("Outter - method");
	}
	
	void makeInstance() {
		Nested nested = new Nested();
		nested.print();
	}

	class Nested {
		String field = "Nested - field";

		void method() {
			System.out.println("Nested - method");
		}

		void print() {// this는 객체 자신의 참조
			System.out.println(this.field); // Nested 참조
			this.method(); // Nested - method 출력

			System.out.println(Outter.this.field); // Outter 참조
			Outter.this.method(); // Outter - method 출력
		}
	}

}
