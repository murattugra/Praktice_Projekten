package _09_Arrays;

public class Q15 {

	public static void main(String[] args) {
		/*
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlarının ayni olup olmadığını kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};
         */

		int []arr={2,6,4,8,2,6,2};
		
		if (arr[0]==arr[arr.length-1]) {
			System.out.println("Ilk ve son eleman esit");
		}else {
			System.out.println("Ilk ve son elema esit degil");
		}
		
		
		
	}

}
