package classOOP.code125_classArray;

public class Code125_classArray {

	public static void main(String[] args) {
		Student[] st = new Student[5];

		st[0] = new Student("Ase", 98);
		st[1] = new Student("Sno", 38);
		st[2] = new Student("Mef", 55);
		st[3] = new Student("Hed", 82);
		st[4] = new Student("Joe", 37);

		// 다섯 학생의 평균 점수를 구해보기
		int sum = 0;
		for (int i = 0; i < st.length; i++) {
			sum += st[i].getScore();
		}
		
		
//		for~each 문으로  적용                     
//		int sum = 0;
//		for(Student s : st){
//			sum += s.getScore();
//		}
//		  
		
		
		double avg = (double) sum / st.length;
		System.out.println("평균점수: " + avg);

	}
}
