package classOOP.code114_static;

public class Circle {

	static double PI = 3.141592;
	double radius;
	
	public Circle(double radius) { //radius:반지름
		this.radius = radius;
	}
	
	double area() { //원 넓이
		return this.radius * this.radius * PI;
	}
	
	double perimeter() { //원 둘레
		return 2 * PI * this.radius;
	}
	
	
	
}
