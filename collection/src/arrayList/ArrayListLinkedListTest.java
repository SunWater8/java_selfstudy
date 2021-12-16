package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {

	public static void main(String[] args) {

		ArrayList al = new ArrayList(2000000);
		LinkedList ll = new LinkedList();

		// 순차적 추가
		System.out.println("[순차적 추가] ");
		long addOrderly2 = add1(ll);
		long addOrderly = add1(al);
		System.out.println("arrayList로 걸린 시간 : "+addOrderly);
		System.out.println("linkedList로 걸린 시간 : "+addOrderly2);
		resultWin(addOrderly, addOrderly2);
		System.out.println();

		// 중간에 추가
		System.out.println("[비순차적 추가] ");
		long addUnOrderly = add2(al);
		long addUnOrderly2 = add2(ll);
		System.out.println("arrayList로 걸린 시간 : "+ addUnOrderly);
		System.out.println("linkedList로 걸린 시간 : "+ addUnOrderly2);
		resultWin(addUnOrderly, addUnOrderly2);
		System.out.println();
		
		// 순차적으로 삭제
		System.out.println("[순차적으로 삭제]");
		long delOrderly = remove1(al);
		long delOrderly2 = remove1(ll);
		System.out.println("arrayList로 걸린 시간 : "+ delOrderly);
		System.out.println("linkedList로 걸린 시간 : "+ delOrderly2);
		resultWin(delOrderly, delOrderly2);
		
		System.out.println();
		
		
		// 중간에서 삭제
		System.out.println("[중간에서 삭제]");
		long delMid = remove2(al);
		long delMid2 = remove2(ll);
		System.out.println("arrayList로 걸린 시간 : "+ delMid);
		System.out.println("linkedList로 걸린 시간 : "+ delMid2);
		resultWin(delMid, delMid2);
		
		
	}
	private static void resultWin(Long al, Long ll) {
		String result = "승자는 ArrayList";
		if(al < ll) {
			System.out.println(result);
		}else {
			result = "승자는 LinkedList";
			System.out.println(result);
		}
	}
	private static long add1(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add(i + "");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	private static long add2(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.add(400, "X");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	private static long remove1(List list) {
		
		long start = System.currentTimeMillis();
		for(int i= list.size()-1; i >= 0; i--) {
			list.remove(i+"");
		}
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
	private static long remove2(List list) {
		long start = System.currentTimeMillis();
		
		for(int i=0; i <10000; i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
}













