package arrayList;

public class MyBook {
	
	private int bookIdx;
	private String bookname;
	private String author;
	private String publisher;
	private int price;

	public MyBook(int bookIdx, String bookname, String author, String publisher, int price) {
		this.bookIdx = bookIdx;
		this.bookname = bookname;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}

	public int getBookIdx() {
		return bookIdx;
	}

	public void setBookIdx(int bookIdx) {
		this.bookIdx = bookIdx;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MyBooks [bookIdx=" + bookIdx + ", bookname=" + bookname + ", author=" + author + ", publisher="
				+ publisher + ", price=" + price + "]";
	}

}
