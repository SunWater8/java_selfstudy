package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest2 {

	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<>(1000000);
		LinkedList<String> ll = new LinkedList<>();
		
		add(al);
		add(ll);
		
		long alAccess = access(al);
		long llAccess = access(ll);
		
		System.out.println("ArrayList 걸린 시간 : "+ alAccess);
		System.out.println("LinkedList 걸린 시간 : "+ llAccess);
		
	}
	
	private static void add(List<String> list) {
		for(int i=0; i<100000; i++) {
			list.add(i+"");
		}
	}
	private static long access(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			list.get(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
}
