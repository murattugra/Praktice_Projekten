package _10_List;

import java.util.ArrayList;
import java.util.List;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * ayna check sorusu: input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 }; output :
		 * verilen array simetriktir
		 */

		int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };

		List<Integer> lst = new ArrayList<>();
		boolean a = true;
		for (int i = arr1.length / 2; i < arr1.length; i++) {
			lst.add(arr1[i]);
		}
		System.out.println(lst);
		int j=3;
		for (int i = 0; i < arr1.length / 2; i++) {
					if (lst.get(j).equals(arr1[i])) {
					a = true;
				} else {
					a = false;
					break;
				}
				j--;
			}
		
		if (a == true) {
			System.out.println(" verilen array simetriktir");
		} else {
			System.out.println(" verilen array simetrik degildir");
		}
	}

}
