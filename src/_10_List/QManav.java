package _10_List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class QManav {
    static List<String> urunListesi =new ArrayList<>();
    static List<Double> urunFiyatlari =new ArrayList<>();
    static double toplamOdenecekTutar;
    public static void main(String[] args) {
        /*
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        
        urunListesi.add("(1)Elma");
        urunListesi.add("(2)Portakal");
        urunListesi.add("(3)Patates");
        urunListesi.add("(4)Sogan");
        urunListesi.add("(5)Patlican");
        
        urunFiyatlari.add(1.90);
        urunFiyatlari.add(2.90);
        urunFiyatlari.add(0.90);
        urunFiyatlari.add(0.50);
        urunFiyatlari.add(1.20);
        
        Scanner scan = new Scanner(System.in);
        String bitir="";
        System.out.println("_________________H O S G E L D I N I Z__________________");
        do {
            System.out.println("_____________________Urun Listemiz______________________");
            System.out.println(urunListesi+"\n");
            System.out.println("(Urunu secmek icin urunun basindaki rakami giriniz)");
            
            int secim=scan.nextInt();
            
            System.out.println(urunListesi.get(secim-1)+"'den kac kilo alma istersiniz?");
            System.out.println("Kilosu:"+urunFiyatlari.get(secim-1)+"tl");
            
            int kilo = scan.nextInt();
            toplamOdenecekTutar+=kilo*urunFiyatlari.get(secim-1);
            System.out.println("Baska urun almak istiyor musunuz?E/H");
            bitir =scan.next();
            
        } while (bitir.equalsIgnoreCase("E"));
        
    
        System.out.println("Odenecek toplam tutar: "+ toplamOdenecekTutar+"tl");
    }
}