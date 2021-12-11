package _03_IfSt_TernarOpHalukHocaPratik;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		 
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Lutfen bir harf giriniz");
		
		char harf=scan.next().charAt(0);
		
		System.out.println(harf>='A'&&harf<='Z'? "Buyuk Harf" :
						  (harf>='a'&&harf<='z'?"Kucuk Harf ":"Hatali karakter girdiniz") );
		
		
		
		
		
		

	}

}
