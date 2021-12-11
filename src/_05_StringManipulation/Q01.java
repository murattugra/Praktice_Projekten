package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
    	
    // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        
        
        Scanner scan=new Scanner(System.in);
        System.out.print("bir string giriniz :");
        String str=scan.nextLine();
        
        
    boolean varMi=  str.contains(" ");
    
    System.out.println("girilen stringde bosluk var mi ? :"+varMi);
    
        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
    
    
       System.out.println("girilen string bos mu ?:"+str.isEmpty());
    }
}
