package chapter04.exam02;

public class Grade {
	private int math;
	private int science;
	private int english;
	private double avg;
	
	public Grade(int m, int s, int e){
		this.math = m;
		this.science = s;
		this.english = e;
	}
	
	public double average() {
		avg = (math + science + english)/3;
		return avg;
	}
}
