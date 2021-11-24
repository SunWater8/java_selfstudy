package map.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Code250 {

	public static void main(String[] args) {

		Map<Integer, Person> map = new TreeMap<>();

		map.put(3, new Person("David", 80));
		map.put(5, new Person("Nancy", 37));
		map.put(1, new Person("Marin", 65));
		map.put(2, new Person("Sunny", 92));
		map.put(4, new Person("lola", 87));

		Set<Integer> keySet = map.keySet();

		System.out.println(keySet);
		System.out.println("-----------------------");

		for (Map.Entry<Integer, Person> e : map.entrySet()) {
			Integer key = e.getKey();
			Person value = e.getValue();
			System.out.println(key + ":" + value);

		}
		System.out.println("-----------------------");
		Person val = (Person)map.get(3);
		System.out.print("key 3 -> ");
		System.out.println(val);
	}
}
