//하나의 양의 정수를 입력받아 각 자리수를 떼어서 출력하기
package iteration;

import java.util.Scanner;

public class Code55_while {

	public static void main(String[] args) {
		
		System.out.print("Enter n : ");
		Scanner sc = new Scanner(System.in);
		
		
		/* 내 스타일
		String[] inputNum = sc.nextLine().split("");
		
		int idx = inputNum.length-1;
		while(0<=idx) {
			System.out.println(inputNum[idx]);
			idx--;
		}
		 */
		
		int n = sc.nextInt();
		while(n>0) {
			int m = n % 10;
			System.out.println(m);
			n /= 10;
		}
		sc.close();
	}
}
