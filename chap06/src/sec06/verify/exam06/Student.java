package sec06.verify.exam06;

public class Student {
	private	String name;
	private int stuId;
	private int grade;
	
	// 생성자
	
	Student(String name, int stuId, int grade){
		this.name = name;
		this.stuId = stuId;
		this.grade = grade;
	}
	
	public void displayInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + stuId);
		System.out.println("학년 : " + grade);

	}
	
		
}
