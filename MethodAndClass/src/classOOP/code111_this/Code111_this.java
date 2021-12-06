//this 키워드
//this는 현재 이용되고 있는 인스턴스를 가리키는 특별한 참조 변수이다.
package classOOP.code111_this;

public class Code111_this {
	public static void main(String[] args) {
		Book book= new Book("Alice", 20000);
		System.out.println(book.title);
 	}
}
