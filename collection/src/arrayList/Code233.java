package arrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class Code233 {

	public static void main(String[] args) {
		
		ArrayList<String> number = new ArrayList<String>();
		
		// insert
		number.add("one");
		number.add("two");
		
		for (int i = 0; i< number.size(); i++) {
			System.out.println(number.get(i));
		}
		
		System.out.println("====================");
		ArrayList<String> languages = new ArrayList<String>();
		
		languages.add("JAVA");
		languages.add("PYTHON");
		languages.add("C");
		
		for(int i=0; i<languages.size(); i++) {
			System.out.println(languages.get(i));
		}
		
		System.out.println("====================");
		//insert between two indexes
		languages.add(2, "html");
		for(int i=0; i<languages.size(); i++) {
			System.out.println(languages.get(i));
		}
		System.out.println("====================");
		//update 
		languages.set(1, "Javascript");
		for(int i=0; i<languages.size(); i++) {
			System.out.println(languages.get(i));
		}
		System.out.println("====================");
		// delete
		languages.remove(3);
		for(int i=0; i<languages.size(); i++) {
			System.out.println(languages.get(i));
		}
		System.out.println("====================");
		
		
		//loop using Iterator Class
		Iterator<String> itr = languages.iterator();
		// interator() : Returns an iterator over the elements in this list in proper sequence.
		// iterator륽 반환
		while (itr.hasNext()) {
			//hasNext() : 리스트에 다음 데이터가 있는지 판단한다.
			String language = itr.next();
			// next() : 리스트에 있는 다음 데이터를 가져 온다.
			System.out.println("[Using Iterator]  "+language);
		}
		
	}
}

/*
 
 새로 알게된 개념
 add()
 set()
 remove()
 
 Iterator
 iterator()
 hasNext()
 next()
  
 */
 