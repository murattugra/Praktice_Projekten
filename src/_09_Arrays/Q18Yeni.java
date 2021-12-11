package _09_Arrays;

import java.util.HashMap;

public class Q18Yeni {

	
		public static void main(String[] args) {
	        String test="Merhaba Dünya yazısıdır 1231";
	        HashMap<Object, Object> hmap = new HashMap<Object, Object>();
	        
	        for (int i = 0; i < test.length(); i++) {
	            if(!hmap.containsKey(test.charAt(i)))
	            {
	                  hmap.put(test.charAt(i),1); 
	            }
	            else
	            {
	                int count= (int)hmap.get(test.charAt(i));
	                hmap.put(test.charAt(i),count+1);
	            }    
	        }
	        System.out.println(test);
	        System.out.println(hmap);
	    
	 
	

	}

}
