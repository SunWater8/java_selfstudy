package iteration_star;

public class Star2 {
	public static void main(String[] args) {
		//순서대로 
		for(int i=1; i<=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println('\n');
		}
	}
}
