package stackAndQueue;

import java.util.Stack;

public class Code238_Stack_peek {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		Integer data = stack.peek(); // 데이터 하나 꺼내진 않고 열어보기
		System.out.println("I peeked : " + data +"\n");
		
		stack.push(40);
		
		int index = stack.search(40);
		System.out.println("data 40 is at : "+ index + "\n");
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println();
		
		// pop() 했으므로 stack에 남은 데이터는 없음.
		boolean dataEmpty = stack.empty();
		System.out.println("Is empty on stack? " + dataEmpty);
	}
}
