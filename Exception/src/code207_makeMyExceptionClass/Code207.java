package code207_makeMyExceptionClass;

public class Code207 {
	public static void main(String[] args) {
		MyException me = new MyException(10); //me는 예외 객체 참조 변수이다.
		
		System.out.println("before throw MyException");
		try {
			
			throw me; // 예외를 발생시키기
		}catch(MyException e) {
			System.out.println(e);
		}
		System.out.println("main ends");
		
		
	}
}
