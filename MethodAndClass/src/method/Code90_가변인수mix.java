// (5, 3, 11, 17, 2, 20, 15) 이 숫자 중에서 10보다 큰 수만 더한 값을 구하기.

// tip : 일반 인수와 가변 인수를 섞어서 사용할 때에는 반드시 가변 인수를 맨 마지막에 적어야 한다.
// 단, 가변인수는 두개 이상 넣으면 안된다. 메소드 생성할 때 예- public static void test(int value, double...w, int...v){}

package method;

public class Code90_가변인수mix {
	public static int largerThanVlaue(int value, int... v) {
		int sum = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] >= value) {
				sum += v[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int largerSum = largerThanVlaue(10, 5, 3, 11, 17, 2, 20, 15);
		System.out.println("sum : "+largerSum);
	}
}
