package _09_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q10 {

	public static void main(String[] args) {
		/*  you have a string "GayetBasarılı"
	        * with arrays change it to "CoookBasarılı" and write changing array
			*(String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )
			*
			*/
		
		
		
		String str="GayetBasarılı";
		
		String arr[]=str.split("t");
		
		System.out.println(Arrays.toString(arr));
		System.out.println();
		arr[0]="Coook";
		
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	
}
}
