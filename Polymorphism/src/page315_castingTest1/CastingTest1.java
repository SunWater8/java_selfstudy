package page315_castingTest1;

public class CastingTest1 {
	public static void main(String[] args) {

		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		
		fe.water();
		car = fe; // (car)fe --> car 형변환이 생략되었음.
		car.drive();
		car.stop();
//		car.water(); // 컴파일러 에러남. 왜냐하면 fe를 car에 대입할 때 Car 클래스 모양으로 형성되었기 때문.
		
		fe2 = (FireEngine)car; // water()메소드는 null이 됨??
		fe2.water();
		
		
		
	}
}

/*
참조변수와 형변환
FireEngine fe = new FireEngine();
FireEngine인스턴스를 생성하고 FireEngine 타입의 참조변수가 참조하도록 한다.

car = fe;
fe변수가 참조하는 인스턴스(주소)를 car변수에 참조하도록 한다. 
둘의 타입이 달라 형변환을 해야 하는데, 조상타입에 대입할 때엔 자손타입 변수앞에 형변환을 생략할 수 있다.
car참조변수를 통해서 FireEngine인스턴스를 사용할 수 있지만, fe와 달리 car는 Car 타입이므로 Car클래스의 멤버가 아닌 water()는 사용할 수 없다.

fe2 = (FireEngine)car;
위와는 반대라서 형변환을 생략할 수 없다.
fe2참조변수를 통해서 FireEngine인스턴스를 사용할 수 있지만, fe2는 FireEngine타입이므로 FireEngine인스턴스의 모든 멤버들을 사용할 수 있다.


*/