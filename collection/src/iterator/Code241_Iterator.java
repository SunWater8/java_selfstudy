package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Code241_Iterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			list.add((i+1)+"");
		}
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		itr = list.iterator(); // Iterator는 재사용이 안되기 때문에 다시 변수를 만들어 주어야 한다.
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
