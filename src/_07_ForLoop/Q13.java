package _07_ForLoop;

import java.util.Scanner;

public class Q13 {
	
	
	public static void main(String[] args) {
		
		/*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Cumle giiniz");
		String cumle=scan.nextLine();
		System.out.println("Harf giriniz");
		String harf=scan.next();
		int sayac=0;
		for (int i = 0; i <=cumle.length(); i++) {
			if (harf.equals(cumle.substring(i, i+1))) {
				sayac+=1;
			}
			
		}
		
		System.out.println("Girdiginiz Harf Cumlede "+sayac+"kere var");
		
		
		
		
		
		
		
	}

}
