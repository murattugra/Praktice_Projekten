package _07_ForLoop;

public class Q19 {
	/*
    Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
           Sonuç böyle olmalıdır;

                  *
                 * *
                * * *
               * * * *
              * * * * *
              
              
              şeklini konsola yazdiriniz.
    */

    public static void main(String[] args) {
    		String b="    ";
    		for (int i = 1; i <=5; i++) {
    			System.out.print(b);
    			for (int j = 1; j <=i; j++) {
					
					System.out.print(" * ");
					
				}
    			
    			System.out.println();
				System.out.println(b);
			
			}

    }
}

