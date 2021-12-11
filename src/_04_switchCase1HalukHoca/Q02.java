package _04_switchCase1HalukHoca;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
    	// 2- Girilen 2 basamaklı bir sayıyı yazı ile yazdırınız
    	int girilenSayi = 57;
    	 
        // Değişken dizisi
        String[] birlerBasamagi = new String[]{"bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
        String[] onlarBasamagi = new String[]{"on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};
 
        // Değişkenler
        String birlerBasamagiYazi, onlarBasamagiYazi;
        int birler, onlar;
 
        // Birler ve onlar basamaklarını parçalarına ayır ve tespit et
        // Girilen sayı (Örn. 82), 10'a bölümünden kalan sayı olarak (Örn. 2) birler basamağı ortaya çıkar
        birler = girilenSayi % 10;
 
        // Girilen sayıdan (Örn. 82), birler basamağı çıkartılıp 10'a bölününce onlar basamağının hangi sayı olduğu ortaya çıkar
        onlar = (girilenSayi - birler) / 10;
 
        // Eğer girilen sayı 1 ila 9 arasında ise birler basamağını yazdır
        if (girilenSayi > 0 && girilenSayi < 10) {
            birlerBasamagiYazi = birlerBasamagi[girilenSayi - 1];
            System.out.println(birlerBasamagiYazi);
        }
        // Girilen sayı 10 ila 99 arasında ise hem onlar hem birler basamağını yazdır
        else {
            birlerBasamagiYazi = birlerBasamagi[birler - 1];
            onlarBasamagiYazi = onlarBasamagi[onlar - 1];
            System.out.println(onlarBasamagiYazi + " " + birlerBasamagiYazi);
        }
    }


        

    }

