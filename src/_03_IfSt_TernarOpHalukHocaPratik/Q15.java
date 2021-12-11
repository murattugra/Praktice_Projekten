package _03_IfSt_TernarOpHalukHocaPratik;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("sayi giriniz");
		
		int sayi=scan.nextInt();
		
		if (sayi>0) {
			System.out.println(sayi);
		} else if(sayi<0){
			System.out.println(sayi*(-1));
		}else {
			System.out.println("sayi 0 dir");
		}
		
		
		
	}

}
