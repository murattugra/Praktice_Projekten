package _13_stringBuilder;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
		/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"

		 */

    	Scanner scan=new Scanner(System.in);
    	System.out.println("Bir cumle giriniz");
    	String cumle=scan.nextLine();
    	
    	StringBuilder sb=new StringBuilder(cumle);
    	
    // yada boyle	sb.append(cumle);
    	
    // yada	StringBuilder sb=new StringBuilder(scan.nextLine());
    	
    	
    	String terscumle=sb.reverse().toString();
    	
    	if (cumle.equalsIgnoreCase(terscumle)) {
			System.out.println("Cumle palindrome dir" );
		} else {
			System.out.println("Cumle palindrome degil");
		}
    	
    			
    }

}
