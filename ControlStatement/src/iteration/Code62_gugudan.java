//중첩된 반복문을 이용하여 (while 문 안에 while문 또 들어감) 구구단을 출력해보기
package iteration;

public class Code62_gugudan {
	public static void main(String[] args) {
		int row = 1, col = 1;
		while (row <= 10) {
			while (col <= 10) {
				System.out.print(row*col+" ");
				col++;
			}
			col=1;
			row++;
			System.out.println();
			
		}
	}
}
