package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		Child child = (Child)parent;
		child.field2 = "uuu";
		child.method3();
		
		child.method1();
		child.method2();
		
		
	}

}
