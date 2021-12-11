package _09_Arrays;

import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {
		/*
		 * Congratulations kelimesini Array yontemlirini kullanarak asagidaki outputu
		 * alin.
		 * input : Congratulations
		 * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]   

		 */

		String str="Congratulations";
		
		String arr[]=str.split("");
		
		System.out.println(Arrays.toString(arr));
	}

}
