package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// Kullanicidan aldigimiz 8 elemanli arrayin icinde 
    	// kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
		
		Scanner scan=new Scanner(System.in);
		int ary[]=new int[8];
		for (int i = 0; i < 8; i++) {
			System.out.println("Lutfen 8 elemanliarray olusturmak icin sayi giriniz");
			ary[i]=scan.nextInt();
		}
		int count=0;
		for (int i = 0; i < ary.length; i++) {
			if (ary[i]%3==0) {
				count++;
			}
			
		}
		System.out.println("Olusturdugunuz Array de "+count+" tane  e bolunebilen sayi var");
	}

}
