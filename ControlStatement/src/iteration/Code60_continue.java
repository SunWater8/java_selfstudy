// 1부터 10까지의 수 중에서 3의 배수를 제외하고 출력하기

package iteration;

public class Code60_continue {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i%3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
