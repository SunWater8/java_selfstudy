package set.hashSet_object;

import java.util.HashSet;

public class Code248 {
	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<>();
		
		hs.add(new String("Alice"));
		hs.add(new String("Alice"));
		hs.add(new Person("Robert", 10));
		hs.add(new Person("Robert", 10));
		
		System.out.println(hs);
	}
}
