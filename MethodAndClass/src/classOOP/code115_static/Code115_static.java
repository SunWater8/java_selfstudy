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
