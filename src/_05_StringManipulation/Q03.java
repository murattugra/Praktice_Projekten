package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
    	
    	  //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

    	Scanner scan=new Scanner(System.in);
    	
    	System.out.println("uc isim yaziniz");
    	
    	String ucisim=scan.nextLine();
    	int index1=ucisim.indexOf(" ");
    	int index2=ucisim.lastIndexOf(" ");
    	
    	System.out.println(ucisim.substring(0, 1)+ucisim.substring(index1,index1+2)+ucisim.substring(index2,index2+2));
    	
    }       
}
