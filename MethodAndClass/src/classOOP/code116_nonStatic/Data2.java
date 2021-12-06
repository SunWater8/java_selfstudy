package classOOP.code116_nonStatic;

public class Data2 {

	static int x;
	int y;

	public Data2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void print() {
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
}
