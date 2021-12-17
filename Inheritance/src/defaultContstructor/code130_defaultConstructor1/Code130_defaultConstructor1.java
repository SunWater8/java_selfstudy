package defaultContstructor.code130_defaultConstructor1;

public class Code130_defaultConstructor1 {
	public static void main(String[] args) {
		
		Child child = new Child();
		// 자손 클래스 인스턴스하면 부모생성자 호출 후에 자신의 생성자 호출한다. 
		
		//System.out.println(child);
		System.out.println("=================");
		child.printParent();
		child.printChild();
	}
	
}
