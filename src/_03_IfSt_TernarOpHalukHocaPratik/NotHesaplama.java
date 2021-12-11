package _03_IfSt_TernarOpHalukHocaPratik;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        /*
        1.Kullaniciya   "Vize sinav sonucunuzu giriniz :"
        2.vize notu double deÄŸerinde girilecek.

        3. KullanÄ±cÄ±ya  "Vize sÄ±navÄ± yÃ¼zdesini giriniz". ->> double olmalÄ± ->> 0,40 etkiliyor   !!YÃ¼zde kaÃ§ etkilediÄŸini Sisteme siz giriyorsunuz.!!

        4.KullanÄ±cÄ±ya    "Final sÄ±nav sonucunuzu giriniz.

        5. final notu double deÄŸerinde olmalÄ±. (Ã¶rn: 65,5)

        6.KullanÄ±cÄ±ya    "Final sÄ±navÄ± yÃ¼zdesini giriniz"-->> double olmalÄ± ->> 0,60 etkiliyor.

        7. Vize final ortalamasÄ±nÄ± bulmak iÃ§in, vize nin yÃ¼zde40 Ä±, finalin yÃ¼zde60 Ä± alÄ±nmalÄ± ve Ã§Ä±kan sonuÃ§lar toplanmalÄ±dÄ±r.

        8. Ã‡Ä±kan sonucu (dersin not ortalamasÄ±nÄ±)   double toplam  ' a eÅŸitleyebilirsiniz.

        todo  :  kosul kismi
 			eÄŸer ortalamasÄ± 90(90 dahil) 'dan bÃ¼yÃ¼k ise, harf notu olarak 
 			AA, 80(80dahil)   ile 90 arasÄ±nda ise  
 			BA, 70(70 dahil)   ile 80 arasÄ±nda ise 
 			BB, 60(60dahil) ile 70 arasÄ±nda ise 
 			CB, 50(50 dahil) ile 60 arasÄ±nda ise 
 			CC, 40(40 dahil) ile 50 arasÄ±nda ise 
 			DC, 30(30 dahil) ile 40 arasÄ±nda ise 
 			DD, 30 'dan dÃ¼ÅŸÃ¼k ise FF  gelmeli.
 			
         */

Scanner scan =new Scanner(System.in);
        
        System.out.print("Vize sınav sonucunuzu giriniz :");
        double vize= scan.nextDouble();
        
        System.out.print("Vize sınavı yüzdesini giriniz:");
        double vize_yuzdesi= scan.nextDouble();
        
        System.out.print("final sınav sonucunuzu giriniz :");
        double fnl= scan.nextDouble();
        
        System.out.print("final sınavı yüzdesini giriniz:");
        double fnl_yuzdesi= scan.nextDouble();
        
        double ortalama=(vize*vize_yuzdesi/100)+(fnl*fnl_yuzdesi/100) ;     
        
        System.out.println("ortalamaniz :"+ortalama);
        
        if (ortalama>=90) {
            System.out.println("gecme notunuz AA");
        }
        else if (ortalama>=80) {
            System.out.println("gecme notunuz BA");
        }
        else if (ortalama>=70) {
            System.out.println("gecme notunuz BB");
        }
        else if (ortalama>=60) {
            System.out.println("gecme notunuz CB");
        }
        else if (ortalama>=50) {
            System.out.println("gecme notunuz CC");
        }
        else if (ortalama>=40) {
            System.out.println("gecme notunuz DC");
        }
        else if (ortalama>=30) {
            System.out.println("gecme notunuz DD");
        }
        else {
            System.out.println("Agam niddin sen ya gecme notunuz FF");
        }
        
        
        
    }
}