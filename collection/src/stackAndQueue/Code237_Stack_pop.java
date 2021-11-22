package stackAndQueue;

import java.util.Stack;

public class Code237_Stack_pop {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		Integer data = stack.pop(); //하나 꺼내보기
		System.out.println("I popped : " + data +"\n");
		
		stack.push(40);
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}
	
}

/*
 Stack은 한쪽 끝에서만 데이터의 추가/ 삭제가 일어나는 구조이다.
 이런 구조는 먼저 들어간 데이터가 나중에 필요할 때 사용할 수 있다.
 
 * Stack의 주요 메소드
 
 push(E item) : 데이터 저장. stack의 top에 원소 item을 추가하기.
 pop() : 데이터 삭제. stack의 top에 있는 원소를 삭제하고 반환함.
 peek() : stack의 top에 있는 원소를 반환함.
 boolean empty() : stack이 비어있는지 판단
 int search(Object o) : stack에서 객체 o를 찾아서 있으면 위치를 반환함.
 
*/