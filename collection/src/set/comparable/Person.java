package set.comparable;

class Person implements Comparable<Person> {

	private int id;
	private int score;

	Person() {
	}

	public Person(int id, int score) {
		this.id = id;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Person p) {
		return this.id - p.id;
	}

}
