package defaultContstructor.code131_defaultConstructor2;

public class Code131_defaultConstructor2 {
	public static void main(String[] args) {
		
	Child child = new Child();
	// 자손 클래스 인스턴스하면 부모생성자 호출 후에 자신의 생성자 호출한다. (에러없이)
	// 즉, 부모클래스에서 기본생성자를 명시적으로 만들지 않았더라도 기본생성자가 있다고 보기 때문에 에러없이  인스턴스에서 호출된다.
	// 기본생성자가 없다면 에러가 날 것이다. 
	
	System.out.println("=================");
	child.printParent();
	child.printChild();
	}
}
