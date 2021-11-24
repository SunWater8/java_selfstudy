package set;

import java.util.HashSet;

public class Code246_HashSet {

	public static void main(String[] args) {
		Integer[] a = {2,3,1,4,4,1,1,2,2,2,3,1,4,4,12};
		HashSet<Integer> hs = new HashSet<>();
		
		for (int i=0;i<a.length; i++) {
			hs.add(a[i]);
		}
		
		System.out.println(hs); 
		//중복된 숫자는 걸러서 오름차순으로 나오는 것을 알 수 있다. 아예 hashSet 저장할 때 미리 거기서 걸러 저장한다.
	}
}
