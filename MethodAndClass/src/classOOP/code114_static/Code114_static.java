package classOOP.code114_static;

public class Code114_static {

	public static void main(String[] args) {
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(100.0);
		
		System.out.println("c1의 넓이 : " + c1.area());
		System.out.println("c1의 둘레 : " + c1.perimeter());
		
		System.out.println("c1의 넓이 : " + c2.area());
		System.out.println("c1의 둘레 : " + c2.perimeter());
		
	}
}

// static 변수
// static 변수는 하나의 클래스에서 정확히 한 개만 만들어지느 변수이다. 