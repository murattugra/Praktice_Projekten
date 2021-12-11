package _06_Method_Creation;

import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		/*
		 * girilen String icinde "xyz" dizimi var ise true degilse false return eden
		 * metod yaziniz
		 *
		 * input output axyzm == true xyz == true x.yz == false xyaz == false
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("icinde bitisik xyz olup olmadigini ogrenmek icin cumle giriniz");

		String cumle = scan.nextLine();

		String xyz = "xyz";

		xyzbul(cumle);

	}

	public static void xyzbul(String cumle) {

		if (cumle.contains("xyz")) {
			System.out.println("Girilen cumle xyz iceriyor");
		} else {
			System.out.println("Girilen cumle xyz icermiyor");
		}

	}

}
