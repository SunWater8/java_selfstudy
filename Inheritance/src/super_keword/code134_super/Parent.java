package super_keword.code134_super;
// 부모클래스에 기본생성자, 일반생성자, 메소드 생성하기.
public class Parent {
	private int dataA;

	Parent() {
	}

	Parent(int dataA) {
		this.dataA = dataA;
	}

	void printA() {
		System.out.println("dataA: " + dataA);
	}
}
