package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
    	 // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.
        
     
    	
    	Scanner scan=new Scanner(System.in);
    	
    	System.out.println("");
    	
    	int toplam=0;
    	
    	
    	for (int i = 1; i <=5; i++) {
			System.out.println("Lutfen "+i+". sayiyi giriniz ");
			int sayi=scan.nextInt();
			if (sayi>5&&sayi<10) {
				System.out.println("Girdiginiz sayi 5 ile 10 arasinda oldugu icin isleme alinmadi");
				continue;
				
			}
			toplam+=i;
		}
    	System.out.println("Girdiginiz sayilarin  toplami :"+toplam);
    	
	
    	/*  Scanner scan = new Scanner(System.in);
        int toplam = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("sayi " + i + " giriniz : ");
            int sayi = scan.nextInt();
            if (sayi > 5 && sayi <10) {
                System.out.println("girilen sayi 5 ile 10 arasi old isleme alinmadi");
                continue;//ticari bekleme devam et komutudur....yok saymak pas geç gibim bisey;
            }
            toplam += sayi;
        }
        System.out.println("girdiginiz sayilarin toplami : " + toplam);
       */ 
    }
}
