//0819
public class August{
	
	public static void main(String[] args) {
		
		//훈련참여지원수당 안내.
		int oneDayKimpo = 284000/18000; 
		int oneDayBit=300000/15000;
		System.out.println("\n〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println(" !!! 수당 받는 최소 날짜 수 !!!");
		System.out.println("김포고용센터 : "+oneDayKimpo);
		System.out.println("비트캠프 : "+oneDayBit);
		System.out.println("받을 수 있는 최대 금액 : "+(284000+300000));
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓\n");
		
		int[] school= {19,20,21,22,23,
				26,27,28,29,30,
				2,3,4,5,6,
				9,10,11,12,13,
				17,18};
		int absent = 0;
		int checked = school.length-absent;
		System.out.println("8월의 출석 날짜   : "+checked);
		
		//이번 달 내가 받을 수당 총 금액
		//고용센터
		int getMoneyKimpo = 18000*checked;
		if(getMoneyKimpo>284000) {
			getMoneyKimpo=284000;
		}
		System.out.println("고용센터에서 받을 돈 : "+getMoneyKimpo);
		
		//비트캠프
		int getMoneyBit = 15000*checked;
		if(getMoneyBit>300000) {
			getMoneyBit=300000;
		}
		System.out.println("비트캠프에서 받을 돈 : "+getMoneyBit);
		//합계
		int sum = getMoneyKimpo + getMoneyBit;
		System.out.println("총 이번 달 받을 돈  : "+sum);
		
		
	}
}