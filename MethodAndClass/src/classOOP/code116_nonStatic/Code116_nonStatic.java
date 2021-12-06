package classOOP.code116_nonStatic;

public class Code116_nonStatic {
	public static void main(String[] args) {
		Data1 d1= new Data1(2,3);
		d1.print();
		
		Data2 d2= new Data2(2,3);
		d2.print();
		
 	}
}

//non-static 메소드에서는 non-static 멤버 또는 static 멤버 모두를 사용할 수 있다. 