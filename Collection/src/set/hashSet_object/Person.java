package set.hashSet_object;

public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " : " + age;
	}
	
	// equals() 와 hasCode() 메소드가 꼭 필요!
	
	// 두 객체의 속성이 같은지 판단하기
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person tmp = (Person)obj;
			boolean result = name.equals(tmp.name) && (age == tmp.age);
			return result;
		}
		return false;
	}
	
	//객체의 속성으로 같은 int 값을 반환하기
	public int hashCode() {
		int result = name.hashCode() + age;
		return result;
	}
	
}
