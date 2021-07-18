//0719 자바의 정석 242p
public class TvTest4 {

	public static void main(String[] args) {

		Tv[] tarr= new Tv[3];
		
		for(int i=0; i<tarr.length;i++) {
			tarr[i]=new Tv();
			tarr[i].channel = i+10;

		}
		for(int i=0;i<tarr.length;i++) {
			tarr[i].channelUp();
			System.out.println("tarr["+i+"].channel = "+tarr[i].channel);
		}
		
	}
}

class Tv {
	String color;
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		channel += channel;
	}

	void channelDown() {
		channel -= channel;
	}
}
