package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
    	
    	// Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

      Scanner scan=new Scanner(System.in);
      
      System.out.println("Lutfen isim soy isim yaziniz");
    	
    	String adsoyad=scan.nextLine().toUpperCase();
    	
    	String ad=adsoyad.substring(0, adsoyad.indexOf(' '));    	
       
    	String soyad=adsoyad.substring(adsoyad.indexOf(' '));    
    	
    	System.out.println("Adiniz : "+ad);
    	
    	System.out.println("Soydiniz : "+soyad);
    	
    	scan.close();
    }
}
