package sec01.exam13;

public class Student {
	String name;
	int number;
	int birthYear;
	/*상단 탭의 Source > Generate hashCode(), equals() 클릭하면 자동으로 메서드 생성해 준다.*/
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // getClass() : Class<?> 타입의 객체를 반환한다.
			return false;				// 이 객체는 해당 객체의 클래스 정보를 담고 있다.
		Student other = (Student) obj;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.number = 1234;
		s1.birthYear = 1995;
		
		Student s2 = new Student();
		s2.name ="홍길동";
		s2.number = 1234;
		s2.birthYear = 1995;
		
		if (s1.equals(s2)) {
			System.out.println("s1 == s2");
		}else
			System.out.println("s1 != s2"); 
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());// 각 다른 값이 나온다
		
		
		System.out.println(s1); // 내부적으로 객체를 출력하면 toString()을 호출한다.
		System.out.println(s1.toString());
	}
	

	
}


