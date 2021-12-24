package page425_throw;

public class Page402_ExceptionEx9 {
	public static void main(String[] args) {
		try {
		Exception e = new Exception("고의로 발생시킴");
		throw e;
		}catch(Exception e) {
			System.out.println("its error message : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음");
	}
}
