package _03_IfSt_TernarOpHalukHocaPratik;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

     /*  Problem Tanımı
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */

    Scanner scan=new Scanner(System.in);
    
    System.out.println("lutfen entere basarak  3 sayi giriniz ");
    
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    
    if (a+b==c||a+c==b||b+c==a) {
		System.out.println("Bu bir dik ucgendir");
	} else {
		System.out.println("Bu bir dik ucgen degildir");
	}  
    
    scan.close();    
    }
}
