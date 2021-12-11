package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /*
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulunuz. Sonucu ekrana yazdırınız.
    */
    	
    	Scanner scan=new Scanner(System.in);
    	List<Integer> lst=new ArrayList<>();
    	lst.add(3);
    	lst.add(6);
    	lst.add(2);
    	lst.add(7);
   
    int toplam=0;
    for (Integer i : lst) {
		toplam+=i*i;

	}
    System.out.println(toplam);
    }
}
