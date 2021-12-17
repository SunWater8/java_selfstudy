package super_keword.code134_super;

public class Code134_super {

	public static void main(String[] args) {
		Child child = new Child();
		child.printA();
		child.printB();
		
		Child child2 = new Child(2,3);
		child2.printA();
		child2.printB();
		
		
		// 부모클래스만 살펴보기.
		Parent parent = new Parent();
		parent.printA();

		Parent parent2 = new Parent(5);
		parent2.printA();
	}
}
