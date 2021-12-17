package defaultContstructor.code130_defaultConstructor1;

// 기본 생성자, 메소드 생성
public class Parent {
	
	//부모클래스에서 기본생성자를 명시적으로 생성
	Parent(){
		System.out.println("parent constructor is called");
	}
	// 부모클래스에서 메소드 생성
	void printParent() {
		System.out.println("I am parent");
	}
}
