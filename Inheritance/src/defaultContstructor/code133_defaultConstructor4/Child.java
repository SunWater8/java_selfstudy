package defaultContstructor.code133_defaultConstructor4;

public class Child extends Parent{

	/*
 	// 자손 클래스에 기본 생성자 생성함.
	Child(){  //에러나서 주석처리 함.
		System.out.println("child cnstructor is called");
	}
//	여기 생성자에서 컴파일 에러 남. 자식 생성자를 호출하기 전에 부모 기본생성자를 호출해야 하는데 
//	부모 생성자가 하나라도 있으면 기본 생성자를 제공하지 않기 때문에
//	적절한 부모 생성자가 없다는 에러이다.
	*/
	
	
	// 자손클래스에서 메소드 생성
	void printChild() {
		System.out.println("I am child");
	}
	
	
	
	// 내가 임의대로 추가해본 생성자. (예제엔 없는 코드)
	public Child(int dataA) {
		super(dataA);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
