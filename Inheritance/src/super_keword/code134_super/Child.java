package super_keword.code134_super;

public class Child extends Parent {

	private int dataB;

	Child() {
	}

	// 부모로부터 물려받은 변수도 생성자의 매개변수로 같이 껴주기.
	public Child(int dataA, int dataB) {
		super(dataA); //부모생성자를 호출.
		this.dataB = dataB;
	}

	void printB() {
		System.out.println("dataB: " + dataB);
	}

}
