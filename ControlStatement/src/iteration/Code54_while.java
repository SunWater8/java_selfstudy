// 하나의 양의 정수를 입력 받아서 while 반복문을 이용하여 n의 약수를 모두 출력하기.

package iteration;

import java.util.Scanner;

public class Code54_while {

	public static void main(String[] args) {
		System.out.print("Enter n : ");
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		int num = 1;
		while(num<=inputNum) {
			if(inputNum%num == 0) {
				System.out.print(num+" ");
			}
			num++;
			
		}
		sc.close();
	}
}
