package problemsolving;

import java.util.Arrays;

public class secondHstFromAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,4,2,7,6,8,13,32};
		
		int[] temp = new int[arr.length];
		
		/*
		 * for(int i = 0;i<= arr.length-1;i++) {
		 * 
		 * if(arr[i] > (arr[i]+1)) {
		 * 
		 * temp[i] = arr[i];
		 * 
		 * }
		 * 
		 * System.out.println(temp[i]);
		 * 
		 * }
		 */
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
