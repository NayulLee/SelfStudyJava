package sec01.exam01;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동일합니다.");
		}else {
			System.out.println("obj1과 obj2는 동일하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동일합니다.");
		}else {
			System.out.println("obj1과 obj3은 동일하지 않습니다.");
		}

	}

}
