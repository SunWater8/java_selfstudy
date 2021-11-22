package arrayList;

import java.util.ArrayList;

public class Code234 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("C");
		list.add("JAVA");
		list.add("Python");
		list.add(2, "Fortran");
		
		for(String x:list) {
			System.out.println(x);
		}
		
		System.out.println("==============");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
