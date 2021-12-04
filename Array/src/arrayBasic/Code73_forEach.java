// for each 이용해서 평균값 구하기.

package arrayBasic;

public class Code73_forEach {

	public static void main(String[] args) {
		double[] score = { 65.3, 98.4, 75.3, 84.6, 75.9 };
		double total = 0.0;
		double average;

		for (double x : score) {
			total += x;
		}
		average = total / score.length;
		System.out.println(average);

	}
}
