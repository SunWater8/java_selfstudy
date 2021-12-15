package classOOP.code122_referenceDataType;

public class Code122_referenceDataType_void {

	static void add(Point t1, Point t2) {
		Point p = new Point();
		p.setX(t1.getX() + t2.getX());
		p.setY(t1.getY() + t2.getY());
		
		System.out.println(p);
	}
	
	public static void main(String[] args) {
		
		Point p1 = new Point(20, 50);
		Point p2 = new Point(40, 100);
		System.out.println(p1);
		System.out.println(p2);
		add(p1, p2);
		
	}
}

