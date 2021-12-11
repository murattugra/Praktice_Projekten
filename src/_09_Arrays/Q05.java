package _09_Arrays;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * write a java program that calculates the average value of array elements
		 * Print elements that are greater than avarage
		 * (dizi elemanlarinin ortalama degerini hesaplayan ve
		 * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
		 * input[]= {1,2,3,4,5,6,7} 
		 * Output : 4
		 */
		
		int ary[]={1,2,3,4,5,6,7};
		
		int toplam=0;
		for (int i = 0; i < ary.length; i++) {
			toplam+=ary[i];
		}
		
		int ortalama=toplam/ary.length;
		System.out.println("ortalama :"+ortalama);
		System.out.println("Ortalamadan Buyuk Elemanlar :");
		for (int i = 0; i < ary.length; i++) {
			if (ary[i]>ortalama) {
				System.out.println(ary[i]);
			}
		}
		
		
		
		
		
		
		}
		
	}


