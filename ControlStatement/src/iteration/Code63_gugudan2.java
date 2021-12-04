//중첩된 반복문을 이용하여 (while 문 안에 while문 또 들어감) 구구단을 출력해보기
package iteration;

public class Code63_gugudan2 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}
}
