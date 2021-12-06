package classOOP.code117_nonStaticBlock;

public class Block {

	Block(){
		System.out.println("I am constructor");
	}
	{
		System.out.println("I am block"); //그냥 블록으로만 되어 있음.
	}
}

//클래스 내에 그냥 블록 또는 static 블록을 넣을 수 있다. 그냥블록은 non-static블록을 말한다.
// non-static 블ㄹ고은 생성자처럼 인스턴스를 생성할 때마다 수행되는 영역이다. 
// new 할 때마다 수행되기 때문에 생성자보다 먼저 호출된다.