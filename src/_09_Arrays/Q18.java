package _09_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18 {
	public static void main(String[] args) {
		// kullanıcıdan alınan bir String'deki herbir karakterin adedini bir array
		// içinde yazdıran bir java programı yazın.
		// String "Javacilar cook afilli" ise cevap şöyle olmalıdır:
		// { =2, a=4, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}

		String cumle = "Javacilar cook afilli";

		String alfabe = "";
		String bos = "";
		int sayac = 0;

		for (char i = 32; i < 126; i++) {

			alfabe += i; // !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}

		}

		for (int i = 0; i < alfabe.length(); i++) { // !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}

			for (int j = 0; j < cumle.length(); j++) { // Javacilar cook afilli

				if (alfabe.charAt(i) == cumle.charAt(j)) {
					sayac++;
				}

			}
			if (sayac > 0) {
				bos += alfabe.charAt(i) + "=" + sayac + "~";
				sayac = 0;
			}
		}

		String arr1[] = bos.split("~");

		System.out.println(Arrays.toString(arr1));

	}
}