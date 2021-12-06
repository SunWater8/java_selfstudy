package classOOP.code116_nonStatic;

public class Data1 {

	static int x;
	int y;

	public Data1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void print() {
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
}
