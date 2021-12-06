//this 키워드는 같은 클래스에 있는 변수 또는 메소드를 호출할 대 이용할 수 있다.

package classOOP.code113_this;

public class Friend {
	String name;
	int age;
	public Friend(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void hello() {
		System.out.println("hello");
	}

	void printString() {
		this.hello();
		System.out.println("Friend [name=" + name + ", age=" + age + "]");
	}
	
}
