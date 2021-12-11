package Praktis_01;

import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		
		/*
	      * kullanicinin ad soyad yas boy kilosunu alt alata yazdiriniz
	      */
		
		Scanner scan=new Scanner(System.in);
        System.out.print("adinizi giriniz:");
        String ad=scan.nextLine();
        
        System.out.print("soyadinizi giriniz:");
        String soyad=scan.next();
        
        System.out.print("yasinizi giriniz:");
        int yas=scan.nextInt();
        
        System.out.print("boyunuzu giriniz:");
        double boy=scan.nextDouble();
        
        System.out.print("kilonuzu giriniz:");
        double kilo=scan.nextDouble();
        
         System.out.println("benim adim:"+ad+"\n"+"soyadim:"+soyad+"\n"
        +"yasim:"+yas+"\n"+"boyum:"+boy+"cm"+"\n"+"kilonuzu giriniz:"+kilo+"kg");
         
         scan.close();



		
		
		
		
		
		
	}

}
