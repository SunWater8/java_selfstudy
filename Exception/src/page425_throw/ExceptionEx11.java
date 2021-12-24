package page425_throw;

public class ExceptionEx11 {

	public static void main(String[] args) {
		throw new RuntimeException();
	}
}

// throw new Exception()에서는 컴파일 에러가 났지만 여기서는 컴파일 에러가 나지 않았다.
// 하지만 실행해 보면 에러가 나서 비정상적으로 종료된 것을 알 수 있다. 
// 왜냐면! RuntimeException클래스와 그 자손에 해당하는 예외는 프로그래머에 의해 실수로 발생하는 것들이기 때문에 예외처리를 강제하지 않기 때문이다. 
// 