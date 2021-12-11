package _03_IfSt_TernarOpHalukHocaPratik;

import java.util.Scanner;

public class Ter02 {

    public static void main(String[] args) {
        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii değeri

       
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.println("Lutfen bir harf giriniz");
    	
    	char harf=scan.next().charAt(0);
    	
     /*	if (harf>='a' && harf<='z') {
			System.out.println("kucuk harf");
		} else if(harf>='A' && harf<='z') {
			System.out.println("buyuk harf");
		}else {
			System.out.println("Harf degil");
		}
    	 
    	scan.close();
    	
    	*/
    	
    	System.out.println(harf>='a' && harf<='z'? "kucuk harf" : (harf>='A' && harf<='Z'? "Buyuk harf" : "harf degil"));
    		
    	
    	
    	
    	
    	
    	
    	
    }
}
