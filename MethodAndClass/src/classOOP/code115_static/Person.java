package classOOP.code115_static;

public class Person {

	static int count;
	String name;
	
	Person(){
		count++;
	}
	
	static void printCount() {
		System.out.println("count : "+ count);
	}
}
