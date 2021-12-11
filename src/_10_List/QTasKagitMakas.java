package _10_List;

import java.util.Scanner;

public class QTasKagitMakas {

    public static void main(String[] args) {
        // tas >makas
        // makas >kagit
        //kagit >tas

    	 Scanner scan =new Scanner(System.in);           
         
         int secim;
         do {
             System.out.println("Tas:\t1\nKagit:\t2\nMakas:\t3\nCikis:\t4");
             
             secim = scan.nextInt();
             String oyunKulanici [] = { "tas","kagit","makas"};
             
                     
             String oyunPc [] = { "tas","kagit","makas"};
             
             
             int pc =(int) (Math.random()*3);
             
        if (secim<=3) {
            
         if (oyunKulanici[secim-1].equals(oyunPc[pc])) {
             
             System.out.println("Berabere  "+oyunKulanici[secim-1]+"="+oyunPc[pc]);
         }
      
         else if (oyunKulanici[secim-1].equals("tas") && oyunPc[pc].equals("makas")) {
             
             System.out.println("----->KAZANDINIZ<-----"+oyunKulanici[secim-1]+">"+oyunPc[pc]);
         }
         else if (oyunKulanici[secim-1].equals("kagit") && oyunPc[pc].equals("tas")) {
             
             System.out.println("----->KAZANDINIZ<----- "+oyunKulanici[secim-1]+">"+oyunPc[pc]);
         }
         
         else if (oyunKulanici[secim-1].equals("makas") && oyunPc[pc].equals("kagit")) {
             
             System.out.println("----->KAZANDINIZ<----- "+oyunKulanici[secim-1]+">"+oyunPc[pc]);
         }
         
         else if (oyunKulanici[secim-1].equals("tas") && oyunPc[pc].equals("kagit")) {
             
             System.out.println("Kaybettiniz :( "+oyunKulanici[secim-1]+"<"+oyunPc[pc]);
         }
         else if (oyunKulanici[secim-1].equals("kagit") && oyunPc[pc].equals("makas")) {
             
             System.out.println("Kaybettiniz :( "+oyunKulanici[secim-1]+"<"+oyunPc[pc]);
         }
         
         else if (oyunKulanici[secim-1].equals("makas") && oyunPc[pc].equals("tas")) {
             
             System.out.println("Kaybettiniz :( "+oyunKulanici[secim-1]+"<"+oyunPc[pc]);
         }
         
     }
      } while (secim!=4);
         
         System.out.println("GuleGule :)");
 
     }
 }

