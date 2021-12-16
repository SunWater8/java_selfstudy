package iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Code240_ListIterator {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("blue");
		list.add("red");
		list.add("black");
		list.add("yellow");
		
		ListIterator<String> it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
	}
}
