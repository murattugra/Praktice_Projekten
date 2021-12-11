package _03_IfSt_TernarOpHalukHocaPratik;

import java.util.Scanner;

public class Q08 {
	/*
	 * Problem tanimi : 
	 * 
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * 
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapin
	 */
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Urun Adedi :");
		System.out.println("Liste Fiyati :");
		
		double adet=scan.nextDouble();
		double fiyat=scan.nextDouble();
		
		System.out.println("Musteri kartiniz varsa E ye yoksa H girin");
		
		char kart=scan.next().toUpperCase().charAt(0);
		if (kart=='E'||kart=='H') {
			if (kart=='E') {
				if(adet>10) {
					System.out.println(fiyat-(fiyat*0.20));
				}else {
					System.out.println(fiyat-(fiyat*0.15));
				}
			}else if(adet<10) {
				System.out.println(fiyat-(fiyat*0.20));
			}else {
				System.out.println(fiyat-(fiyat*0.15));
			}
		 
		}
		else {
			System.out.println("Lutfen gecerli bir harf giriniz");
		}
		}
	}


