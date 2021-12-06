//어러 생성자를 만들어야 할 때 앞에 중복되는 변수는 this(변수); 로 하면 된다.

package classOOP.code111_this;

public class Book {
	//인스턴스 변수
	String title;
	int price;

	public Book() {
	}

	public Book(String title) {
		this.title = title;// 인스턴스변수 - 매개변수
	}

	public Book(String title, int price) {//매개변수
		this(title); // 중복을 피하기 위해 다르게 표현됨.
		this.price = price;
	}

	@Override
	public String toString() {
		return "book [title=" + title + ", price=" + price + "]";
	}

}