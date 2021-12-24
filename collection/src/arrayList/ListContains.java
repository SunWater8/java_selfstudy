package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ListContains {

	public static void main(String[] args) {
		
		List<MyBook> list = new ArrayList<>();
		list.add(new MyBook(1, "Haryy Potter", "rolling", "England", 11000));
		list.add(new MyBook(2, "Sandbeam", "John", "Sun", 22500));
		System.out.println(list);	
		
		
		List<String> date = new ArrayList<>();
		date.add("Mon");
		date.add("Tue");
		date.add("Wed");
		date.add("Thu");
		date.add("Fri");
		
		boolean result = date.contains("Mon");
		System.out.println(result);
		

	}

}
