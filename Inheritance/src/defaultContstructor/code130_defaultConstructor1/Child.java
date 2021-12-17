package defaultContstructor.code130_defaultConstructor1;
// 기본 생성자, 메소드 생성
public class Child extends Parent{
	// 자손 클래스에서 기본 생성자 명시적으로 생성
	Child(){
		System.out.println("child constructor is called");
	}
	//자손 클래스에서 메소드 생성
	void printChild() {
		System.out.println("I am child");
	}
	
	
}
