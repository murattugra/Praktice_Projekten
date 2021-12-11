package _09_Arrays;

public class Q17 {

	// Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar
	// olsun.
	// Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.

	public static void main(String[] args) {

		int somun[] = { 4, 5, 6, 7, 8, 4, 9, 10, 11, 12 };

		int civatalar[] = { 7, 8, 9, 10, 11, 12, 13, 4, 1, 8 };

		int sayi = 0;

		for (int i = 0; i < civatalar.length; i++) {

			for (int j = 0; j < somun.length; j++) {

				if (civatalar[i] == somun[j]) {
					System.out.println(civatalar[i] + " " + somun[j]);
					sayi++;
				}
			}
		}

		System.out.println("birbiriyle uyumlu civata somun sayisi: " + sayi);

	}
}
