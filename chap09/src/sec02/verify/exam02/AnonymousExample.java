package sec02.verify.exam02;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("트럭이 달립니다.");
			}
		});
	}

}
