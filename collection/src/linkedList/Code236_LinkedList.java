package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Code236_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("C");
		list.add("JAVA");
		list.add("Python");
		list.add("Fortran");
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("============");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}

	}
}
