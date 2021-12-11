package Praktis_01;

public class Praktik_01_RakamlariYukaridanAsagiyaYazdirma {

	public static void main(String[] args) {
		// verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru yazdiriniz
		// ex: input:12345
		//output: 1
		//		  2
		//	 	  3
		// 	      4
		//		  5
		
		
		int sayi=12345;
		
	
		
		int birler=sayi%10;
		int onlar=(sayi/10)%10;
		int yuzler=(sayi/100)%10;
		int binler=(sayi/1000)%10;
		int onbinler=(sayi/10000);
		
		/*
		System.out.println(onbinler);
		System.out.println(binler);
		System.out.println(y�zler);			Bu uzun yolu alt alta yazdirmanin
		System.out.println(onlar);
		System.out.println(birler);
		*/
		
		
		System.out.println(onbinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+birler);
		//Bu kisa yolu   consolda alt satira yazdirmak icin   "\n"   komutu kullanilir
		
		
	}

}
