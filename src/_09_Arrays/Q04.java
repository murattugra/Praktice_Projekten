package _09_Arrays;

public class Q04 {

	public static void main(String[] args) {
		/*
		 *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
		 * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
		 * int istenenToplam=9;
		 */

		int ary[]={5,7,-6,4,2,15,3,8,1};
		 int istenenToplam=9;
		String ciftler="";
		for (int i = 0; i < ary.length; i++) {
			for (int j = 1; j < ary.length; j++) {
				if (ary[i]+ary[j]==istenenToplam) {
					ciftler+=ary[i]+ary[j];
					System.out.println(ary[i]+"+"+ary[j]+"= "+istenenToplam);
				}
			}
		}
		
	}

}
