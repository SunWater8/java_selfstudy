package set.comparator;

public class Person {

	private int id;
	private int score;

	public Person() {
	}

	public Person(int id, int score) {
		this.id = id;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", score=" + score + "]";
	}

}
