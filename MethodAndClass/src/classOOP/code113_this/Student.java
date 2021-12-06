// 어러 생성자를 만들어야 할 때 앞에 중복되는 변수는 this(변수); 로 하면 된다.
// 주의할 점! : 반드시 생성자 첫 줄에 한 번만 써야 한다. 

package classOOP.code113_this;

public class Student {
	int number;
	String name;
	double score;
	
	Student(){}

	public Student(int number) {
		this.number = number;
	}

	public Student(int number, String name) {
		this(number);
		this.name = name;
	}

	public Student(int number, String name, double score) {
		this(number,name);
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", score=" + score + "]";
	}
	
}
