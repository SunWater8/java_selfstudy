// 가변인수는 메소드를 호출할 때 넘기는 인수의 개수가 가변적인 것을 말한다. 즉, 원하는 개수만큼의 인수를 입력으로 보낼 수 있다. 
// 넘어오는 인수는 개수가 몇 개이든지 배열로 저장이 된다. 
package method;

public class Code89_가변인수 {
	public static void main(String[] args) {
		varArgTest();
		varArgTest(2);
		varArgTest(2,5);
		varArgTest(6,2,8);
	}
	
	public static void varArgTest(int ... v) {
		System.out.println("array's length : "+ v.length);
		
		for(int i=0; i<v.length; i++) {
			System.out.println("value: "+v[i]);
		}
	}
}
