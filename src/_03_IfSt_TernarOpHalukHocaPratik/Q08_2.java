package _03_IfSt_TernarOpHalukHocaPratik;

import java.util.Scanner;

public class Q08_2 {

	
		public static void main(String[] args) {

			Scanner giris = new Scanner(System.in);

			System.out.println("Lutfen aldiginiz urunun adedini giriniz");
			int adet = giris.nextInt();

			System.out.println("Lutfen aldiginiz urunun liste fiyatini giriniz");
			double price = giris.nextDouble();
			double totalPrice;

			System.out.println("Musteri kartiniz var mi? Varsa Y yoksa N tusuna basiniz");
			char card = giris.next().toLowerCase().charAt(0);

			if (card == 'y') {
				if (adet > 10) {
					price *= 0.8;
					totalPrice = price * adet;
					System.out.println("%20 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: " + totalPrice);
				} else {
					price *= 0.85;
					totalPrice = price * adet;
					System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: " + totalPrice);
				}

			} else if (card == 'n') {
				if (adet > 10) {
					price *= 0.85;
					totalPrice = price * adet;
					System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: " + totalPrice);

				} else {
					price = price - price * 10 / 100;
					totalPrice = price * adet;
					System.out.println("%10 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: " + totalPrice);
				}
			} else {
				System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz");
			}

			giris.close();
		}
	
	}


