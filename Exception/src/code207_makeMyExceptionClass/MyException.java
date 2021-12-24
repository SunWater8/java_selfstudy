package code207_makeMyExceptionClass;

public class MyException extends Exception {

	int x;

	public MyException(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "I am " + x + " in MyException class";
	}

}
