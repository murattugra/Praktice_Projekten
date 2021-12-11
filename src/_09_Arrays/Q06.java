package _09_Arrays;

import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {
	
	/*    write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyükk ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)
	
	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	
	*/
    	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
    	
    	Arrays.sort(arr);
    	int min=arr[0];
    	int max=arr[arr.length-1];
    	int ikinci=arr[arr.length-2];
    	
    	System.out.println("En kucuk sayi :"+min);
    	System.out.println("En buyuk sayi :"+max);
    	System.out.println("Ikinci en buyuk sayi :"+ikinci);
    }

}
