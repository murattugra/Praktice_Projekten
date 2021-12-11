package _12_Varargs;

public class Q02 {
	public static void main(String[] args) {
		 
		// verilen int lerden ilki haric tum sayilari toplayan ve
				// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.
		
		
		
		metod( 2,4,6,8,4);
		


	}

	private static void metod(int i, int... j) {
		int toplam=0;
		int carpim=1;
		
		for (int k : j) {
			toplam+=k;
		}
		carpim=toplam*i;
		System.out.println(carpim);
	}

}
