package _03_IfSt_TernarOpHalukHocaPratik;
import java.util.Scanner;

public class Q16 {

    
    public static void main(String[] args) {
    	/*
        Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
        en kucuk olanlarini konsola yazdiriniz
        int num1 
        int num2 
        int num3
    */
    
    	Scanner scan=new Scanner(System.in);
        
        System.out.println("Lutfen 3 numara giriniz");
      		 
      	int sayi1=scan.nextInt();
      	int sayi2=scan.nextInt();
      	int sayi3=scan.nextInt();
      	
      	
      	if (sayi1>sayi2&&sayi1>sayi3) {
			if(sayi2>sayi3){
				System.out.println("Buyuksayi : "+sayi1+"\n"+"Kucuk sayi :"+sayi3);
			}else {
				System.out.println("Buyuksayi : "+sayi1+"\n"+"Kucuk sayi :"+sayi2);
			}
		} else if(sayi2>sayi1&&sayi2>sayi3){
			if(sayi1>sayi3){
				System.out.println("Buyuksayi : "+sayi2+"\n"+"Kucuk sayi :"+sayi3);
			}else {
				System.out.println("Buyuksayi : "+sayi2+"\n"+"Kucuk sayi :"+sayi1);
			}
		}else if(sayi3>sayi1&&sayi3>sayi2) {
			if(sayi2>sayi1){
				System.out.println("Buyuksayi : "+sayi3+"\n"+"Kucuk sayi :"+sayi1);
			}else {
				System.out.println("Buyuksayi : "+sayi3+"\n"+"Kucuk sayi :"+sayi2);
			}
			
			
			
			scan.close();
		}
    }
}
			
		
		
    
    	
    	
    	
    


