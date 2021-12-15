package classOOP.code121_getterSetter;

public class Code121_getterSetter {

	public static void main(String[] args) {
		
//		생성자를 통해 초기값을 주지 않았을 경우
		Book book = new Book();
//		생성자를 통해 초기값을 주었을 경우
		Book book2 = new Book("Harry", 2000);
		System.out.println(book2);
		
//		생성자를 통해 초기값을 주지 않았을 땐 기본 값은 null과 0으로 되어 있다. 
		book.getPrice();
		System.out.println(book);
		
//		하지만 setter로 값을 설정해줄 수 있다. 
		book.setTitle("Tom");
		System.out.println(book);
		
//		생성자를 통해서 초기값을 주었더라도 setter를 통해 값을 변경할 수 있다
		System.out.println("book2.getPrice() : " +  book2.getPrice());
		book2.setPrice(6000);
		System.out.println("book2.getPrice() : " +  book2.getPrice());
	}
}
