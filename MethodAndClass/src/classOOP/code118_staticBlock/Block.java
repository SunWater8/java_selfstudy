package classOOP.code118_staticBlock;

public class Block {

	Block(){
		System.out.println("I am constructor");
	}
	static {
		System.out.println("I am block"); //그냥 블록으로만 되어 있음.
	}
}


// static block
// static 블록은 생성자처럼 첫 번째 인스턴스를 생성하기 바로 전에 한 번만 수행되는 블록이다.