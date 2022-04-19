package iteration_star;

public class Star1 {
	public static void main(String[] args) {

		// 첫 줄엔 * 다섯개.
		for (int i = 1; i <= 5; i++) {
			System.out.print('*');
		}
		System.out.println('\n');

		for (int i = 1; i <= 4; i++) {
			System.out.print('*');
		}
		System.out.println('\n');

		for (int i = 1; i <= 3; i++) {
			System.out.print('*');
		}
		System.out.println('\n');

		for (int i = 1; i <= 2; i++) {
			System.out.print('*');
		}
		System.out.println('\n');

		for (int i = 1; i <= 1; i++) {
			System.out.print('*');
		}

		System.out.println('\n');
		System.out.println('\n');
		System.out.println('\n');

		for (int j = 5; j >= 0; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print('*');
			}
			System.out.println('\n');
		}

	}

}
