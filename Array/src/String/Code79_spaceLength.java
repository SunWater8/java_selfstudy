// 문자열의 길이 비교해보기
package String;

public class Code79_spaceLength {
public static void main(String[] args) {
	String name = "hello";
	String emptyString = "";//빈문자
	String space=" ";//공백문자
	
	System.out.println(name.length());
	System.out.println(emptyString.length());
	System.out.println(space.length());
	
	//번외 : 배열의 길이를 나타내는 메소드는 length()가 아닌 length이다. (괄호 없음)
	String[] arr = {name, emptyString, space};
	System.out.println(arr.length);
}
}
