package _03_IfSt_TernarOpHalukHocaPratik;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	/*
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	     
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */
	
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Lutfen uc tane pozitif tam sayi giriniz");
	
	int sayi1=scan.nextInt();
	int sayi2=scan.nextInt();
	int sayi3=scan.nextInt();
	
	
	if (sayi1<(sayi2+sayi3)) {
		if (sayi1==sayi2 && sayi2==sayi3) {
			System.out.println("Bu olculer ile eskenar ucgen yapilabili");
		}else if(sayi1==sayi2 || sayi1==sayi3 ||sayi2==sayi3){
			System.out.println("Bu olculerle ikiz kenar ucgen yapilabilir");
		}else {
			System.out.println("Bu olculerle cesitkenar ucgen yapilabilir");
		}
	} else {
		System.out.println("Bu olculerle ucgen yapilmaz");
	}
	
	
	
	
	

	}

}
