// 문자가 같은지 비교하기 위해서는 equals() 메소드를 사용하면 된다.

package String;

public class Code77_equals {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = new String("hello");

		if (s1 == s2) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
		
		System.out.println("==========");
		if(s1.equals(s2)) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
	}
}
