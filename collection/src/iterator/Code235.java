package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Code235 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("C");
		list.add("JAVA");
		list.add("Python");
		list.add(2, "Fortran");
		
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String t = itr.next();
			System.out.println(t);
		}
		
	}
}
