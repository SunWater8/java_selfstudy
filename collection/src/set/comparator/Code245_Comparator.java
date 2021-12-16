package set.comparator;

import java.util.TreeSet;

public class Code245_Comparator {
	public static void main(String[] args) {
		
		//score 순으로 정렬(오름차순)
		TreeSet<Person> ts = new TreeSet<>(new PersonComparator());
		ts.add(new Person(3,83));
		ts.add(new Person(5,90));
		ts.add(new Person(1,93));
		ts.add(new Person(2,88));
		ts.add(new Person(4,70));
		
		for(Person p:ts) { //ts에서 차례대로 객체를 꺼내서 p에 넣겠다는 의미.
			System.out.println(p);
		}
	}
	
}
