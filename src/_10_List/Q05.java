package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek elemanlarını ayrı diziye bir metodda atayarak
        // main de yazdırınız.

    	Scanner scan=new Scanner(System.in);
    	List<String> listt=new ArrayList<>();
    	
    	int sayac=1;
    	do {
    		
        	System.out.println("Lutfen "+sayac+". ismi yaziniz");
        	
        	listt.add(scan.next());
        	
    		sayac++;
     
    	}while(sayac<7);

    	System.out.println(tekEleman(listt));
    }

	private static List<String> tekEleman(List<String> listt) {
		
    	List<String> lst2=new ArrayList<>();
		for (int i = 0; i < listt.size(); i+=2) {
			lst2.add(listt.get(i));
			
		}
    
		return lst2;

		
	}


}
