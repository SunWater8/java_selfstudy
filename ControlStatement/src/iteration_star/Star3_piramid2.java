package iteration_star;

public class Star3_piramid2 {
	public static void main(String[] args) {
		// * 1
		// *** 3
		// ***** 5
		// ******* 7
		// ********* 9

		int count = 5;
		for (int k = 0; k < count; k++) {
		
			for (int i = count - 1; i > k; i--) {
				System.out.print(' ');
			}
			for (int i = 0; i < k * 2 + 1; i++) {
				System.out.print('*');
			}
			
			System.out.println();
		}

	}
}
