package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q02 {

    public static void main(String[] args) {
     //2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
     //listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
     //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
     //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]


    	String arr[][]={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
 
    	sirala(arr);
    	
    }

    public static void sirala(String [][]arr1) {
      	
    	List<String> lst=new ArrayList<>();
    	
    	for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				lst.add(arr1[i][j]);
			}
		}
    	Collections.sort(lst);
    	System.out.println(lst);
    	
    }
    
}
