package classOOP.code122_referenceDataType;

public class Code123_referenceDataType2_set {
	
//	어떤 클래스의 값을 초기화 해주는 메소드
	static void change(Point t) {
		t.setX(10);
		t.setY(33);
	}
	public static void main(String[] args) {
		Point p = new Point();
		change(p);
		System.out.println(p);
	}
}

