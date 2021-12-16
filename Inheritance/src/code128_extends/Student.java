package code128_extends;

public class Student extends Person{

	private int score;

	public Student() {
	}

	public Student(String name, String phone, int score) {
		super(name, phone);
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [score=" + score + "\n, getName()=" + getName() + "\n, getPhone()=" + getPhone() + "\n, toString()="
				+ super.toString() + "\n, getClass()=" + getClass() + "\n, hashCode()=" + hashCode() + "]";
	}

	
	

	
	
}
