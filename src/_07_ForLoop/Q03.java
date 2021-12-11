package _07_ForLoop;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {

		/*
		 * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
		 * döngüden çıkılsın
		 * 
		 * Bugün hava oldukca güzel.-> 2
		 *  
		 */

	Scanner scan = new Scanner(System.in);

	System.out.println("Bir String Giriniz");

		String str = scan.nextLine();

		int aMiktari = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.toLowerCase().charAt(i) == 'a') {
				aMiktari++;

			} else if (str.toLowerCase().charAt(i) == 'c') {
				break;
			}
		}

		System.out.println("Girdiginiz Stringdeki a sayisi : " + aMiktari);
		
	}

}
