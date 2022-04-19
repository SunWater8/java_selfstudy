package iteration_star;

public class Star3_piramid {
	public static void main(String[] args) {
		// 피라미드 별 찍기

		// 1행 : '    *'     1 (공백 4개 )
		// 2행 : '   ***'    3 (공백 3개 )
		// 3행 : '  *****'   5 (공백 2개 )
		// 4행 : ' *******'  7 (공백 1개 )
		// 5행 : '*********' 9 (공백 0개 )

		for (int k = 4, s = 1; k >= 0; k--) {
			for (int i = 1; i <= k; i++) {
				System.out.print(' ');
			}

			for (int j = 1; j <= 2 * s - 1; j++) { // 별이 1개 반복
				System.out.print('*');
			}

			s++;
			System.out.println();

		}
		System.out.println("the end");

	}
}
