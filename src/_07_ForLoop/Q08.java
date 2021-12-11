package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
    	 // Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String’in palindrome olup olmadigini kontrol eden bir program yazin.

       Scanner scan=new Scanner(System.in);
       
       System.out.println("Palindrome olup olmadigini ogrenmek icin \n       Bir kelime giriniz");

       String str=scan.nextLine();
       String ters="";
       
       for (int i = str.length()-1; i >=0; i--) {
		
		ters+=str.substring(i, i+1);
	}
       if (str.equals(ters)) {
		System.out.println("Girdiginiz kelime Palindrome dir");
	} else {
		System.out.println("Girdiginiz kelime Palindrome degildir");
	}
       

    }

}

