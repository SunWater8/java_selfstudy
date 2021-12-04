package arrayBasic;

import java.util.Arrays;

public class Code67_copyarray {
public static void main(String[] args) {
	int[] original = {5,6,7,1,2};
	int[] destination = {0,1,2,3,4,5,6,7,8,9};
	System.out.println(Arrays.toString(destination)); 
	System.arraycopy(original, 2, destination, 4, 3); // 
	System.out.println(Arrays.toString(destination));
}
}
