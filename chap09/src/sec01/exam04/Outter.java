package sec01.exam04;

public class Outter {
	public void method(final int arg) {
	// java 7 이전
	final int localVariable = 1;
	// arg = 100;
	// localVariable = 100;
	class Inner{
		public void method() {
			int result = arg + localVariable;
			}
		}
	}
	
	public void method2(int arg) {
		int localVariable = 1;
		// arg = 100;
		// localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}	
