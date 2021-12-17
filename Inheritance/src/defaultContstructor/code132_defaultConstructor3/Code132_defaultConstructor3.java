package defaultContstructor.code132_defaultConstructor3;

public class Code132_defaultConstructor3 {

	public static void main(String[] args) {
		
//	Child child = new Child(); --> compile에러남. 자손클래스에서 기본 생성자가 없기 때문
	Child child = new Child(20); // --> 인자가있으니 컴파일 에러 안남.
	
	System.out.println("===========");
	child.printParent();
	child.printChild();
	}
	
	
}
