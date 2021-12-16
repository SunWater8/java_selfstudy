package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		List list = new ArrayList(10);
		
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(0);
		list.add(4);
		list.add(3);
		
		//subList() 메소드 사용
		List list2 = new ArrayList(list.subList(1, 4));
		
		print(list, list2);
		
		// sort() 정렬 메소드 사용
		Collections.sort(list);
		Collections.sort(list2);
		print(list, list2);
		
		//containsAll()
		boolean containList = list.containsAll(list2);
		//containsAll() : Returns true if this list contains all of the elements of the specified collection. list2 내용이 list에 다 포함된 내용이냐?
		System.out.println("containsAll(): "+containList);
		
		// retainAll()
		//list에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		boolean retainList = list.retainAll(list2);
		// retainAll() : Retains only the elements in this list that are contained in thespecified collection (optional operation). In other words, removes from this list all of its elements that are not contained in the specified collection.
		// Returns true if this list changed as a result of the call 
		System.out.println();
		
		print(list, list2);
		
		// contains(), remove()
		// list2에서 list에 포함된 객체들을 삭제한다.
		// contains() : Returns true if this list contains the specified element.More formally, returns true if and only if this list containsat least one element e such that 
		for(int i = list2.size()-1; i>= 0; i--) {
			if(list.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list, list2);
		
		
		
	}

	private static void print(List list, List list2) {
		System.out.println("list: "+list);
		System.out.println("list2: "+list2);
		System.out.println();
	}
}

/* 새로 알게 된 개념

subList()
Collections.sort()
containsAll()
contains()
retainAll()

*/