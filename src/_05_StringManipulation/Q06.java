package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
    	 /*
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa,
         "gmail" ile değiştirin,
         örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
         */

    	Scanner scan=new Scanner(System.in);
    	
    	System.out.println("Lutfen bir e-posta adresi giriniz");
       
    	String email=scan.next();
    	
    	if (email.contains("hotmail")) {
			System.out.println(email.replace("hotmail", "gmail"));
			
		} else {
			System.out.println("mailiniz basarili");
		}
    	
    	
    	
    	
    }
}
