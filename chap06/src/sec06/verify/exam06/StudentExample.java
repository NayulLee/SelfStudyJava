package sec06.verify.exam06;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student("이나율", 202202159, 3);
		Student std2 = new Student("조민호", 202202158, 2);
		
		std1.displayInfo();
		System.out.println("--------------------------");
		std2.displayInfo();
	}

}
