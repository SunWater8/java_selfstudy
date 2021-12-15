package classOOP.code122_referenceDataType;

public class Code124_referenceDataType3_return {

	static Point add(Point p1, Point p2) {

		Point p3 = new Point();
//		Point p3;  --> 인스턴스 해주지 않으면 변수에 값을 주어야 한다고 에러메시지가 뜸
		p3.setX(p1.getX()+p2.getX());
		p3.setY(p1.getY()+p2.getY());
		
		return p3;
	}

	public static void main(String[] args) {
		Point p1 = new Point(2, 3);
		Point p2 = new Point(5, 6);
		
		System.out.println(p1);
		System.out.println(p2);
		
		Point result = add(p1, p2);
		System.out.println(result);
		
	}
}
