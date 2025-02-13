package sec01.verify;

public class SoundableExample {

	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSound(new Dog());
		printSound(new Cat());
	}

}
