package defaultContstructor.code132_defaultConstructor3;

public class Child extends Parent{
	private int data;
	
	//자손클래스에서 기본 생성자는 없고 일반 생성자만 생성.
	Child(int data){
		this.data = data;
		System.out.println("arg : "+data);
	}
//	자손클래스에서 메소드 생성
	void printChild() {
		System.out.println("data: "+ data);
	}
}
