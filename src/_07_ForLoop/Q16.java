package _07_ForLoop;

public class Q16 {
    public static void main(String[] args) {
    	  /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */
    						
    	for (char satir = 'A'; satir <='F'; satir++) {
			for (char harf = 'A'; harf <=satir; harf++) {
				System.out.print(harf+" ");
		
			}
			System.out.println();
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	/*    int harf=65;
    	  for (int baba = 0; baba < 6; baba++) {
    	      for (int evlat = 0; evlat <=baba; evlat++) {
    	          System.out.print((char)(harf+baba)+" ");// 15 inci sorudan tek evlat yerine baba var
    	        
    	    }
    	    System.out.println();
    	}
  */
    }

}
