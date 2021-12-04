// 1보다 큰 양의 정수 하나를 입력받아서 그 수가 소수인지 판단하는 프로그램을 작성하기. 
// 소수라면 '소수 입니다'라고 출력하고, 아니라면 '합성수 입니다'라고 출력하기
// 예를들어 어떤 수 n의 약수의 개수가 2라면, n은 소수입니다.
package iteration;

import java.util.Scanner;

public class Code57_for {
	public static void main(String[] args) {

		System.out.print("Enter n : ");
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= inputNum; i++) {

			if ((inputNum % i) == 0) {
				count++;
			}
		}
		System.out.println(count);
		if (count == 2) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("합성수 입니다.");
		}
	}
}
