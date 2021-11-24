package set;

import java.util.Iterator;
import java.util.TreeSet;

public class Code242_TreeSet {

	public static void main(String[] args) {
		int A[] = {4,6,1,9,8,10,5,2,3,7};
		TreeSet<Integer> ts = new TreeSet<>();
		
		// treeSet은 이진트리 구조를 갖고 있는데, 데이터를 저장하면서 자동정렬한다. 
		for(int i=0; i<A.length; i++) {
			ts.add(A[i]);
		}
		
		System.out.println(ts); // [1,2,3,4,5,6,7,8,9,10]
		
		Iterator<Integer> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		
	}
}
