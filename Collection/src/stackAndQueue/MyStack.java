package stackAndQueue;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector{
	
	//push라는 메소드. 객체를 주입하여 그 객체를 넣은 메소드 생성 Object obj = push(something); 이렇게 하면 이제 객체가 매개변수로 들어가서 추가된다는 의미.  
	public Object push(Object item) {
		addElement(item);
		// addElement(E obj) : Adds the specified component to the end of this vector, increasing its size by one. The capacity of this vector is increased if its size becomes greater than its capacity.
		// This method is identical in functionality to the add(E) method (which is part of the List interface). // object의 사이즈를 늘려줌?
		return item;
	}
	
	
	public Object pop() {
		Object obj = peek();
		removeElementAt(size() -1);
		return obj;
	}
	
	public Object peek() {
		int len = size();
		if(len == 0) {
			throw new EmptyStackException();
		}
		return null;
	}
	
	public boolean empty() {
		return size() == 0;
	}
	
	public int search(Object o) {
		int i = lastIndexOf(o);
		if(i >= 0) {
			return size() - i;
		}
		return -1;
	}
}
