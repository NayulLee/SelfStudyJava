package chapter03.exam02;

public class dimention2array {

	public static void main(String[] args) {
		int intArray [][] = new int[5][];
		
		intArray[0] = new int[1];
		intArray[1] = new int[3];
		intArray[2] = new int[1];
		intArray[3] = new int[4];
		intArray[4] = new int[2];
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = j+1;
			}
		}
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
