package classOOP.code115_static;

public class Code115_static {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		Person.printCount();
		p1.printCount();
		p2.printCount();
		
	}
}

// static 메소드

// static 메소드를 호출할 때에는 '클래스.메소드명()'을 이용한다.
// 위의 코드에서처럼 p1.perintCount()는 잘못된 호출 방식이다. Person.printCount()가 맞다.