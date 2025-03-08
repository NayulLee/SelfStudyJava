package sec01.verify.exam03;

public class Student {

		private String studentNum;
		
		public Student(String studentNum) {
			this.studentNum = studentNum;
		}
	
		public String getStudentNum() {
			return studentNum;
		}
		
		@Override
		public int hashCode() {
			return studentNum.hashCode();
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student std = (Student) obj;
				if(std.studentNum.equals(this.studentNum)) {
					return true;
				}
			}
			return false;
		}
		
}
