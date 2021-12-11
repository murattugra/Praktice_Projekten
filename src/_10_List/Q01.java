package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {
        /*
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
    	String arr[]={"Ali","Veli","Ayse","Fatma","Omer"};
    	
    	List<String> lst=new ArrayList<>();
    	
    	for (String each : arr) {
			lst.add(each);
    	}
    	    	
     
    	System.out.println(lst);
    	
    	for (int j = 0; j < lst.size(); j++) {
    		if (lst.get(j).contains("a")||lst.get(j).contains("A")) {
    			lst.remove(j);
    			j--;
    		}
		}
    	System.out.println(lst);
    	
    
    }
}
