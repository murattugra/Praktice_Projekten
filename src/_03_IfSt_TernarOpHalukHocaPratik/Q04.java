package _03_IfSt_TernarOpHalukHocaPratik;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan IT alanini isteyerek
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		yazdiriniz
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen It alaninizi asagidaki kodlarla giriniz\nqa\n"
				+ "dev  \nba  \npm ");
		
		
		String alan=scan.nextLine();
		
		if (alan.toLowerCase().equals("qa")) {
			System.out.println("It alaniniz ==>Quality Analyst ");
		} else if (alan.toLowerCase().equals("dev")){
			System.out.println("It alaniniz ==>Developer");
		}else if (alan.toLowerCase().equals("ba")) {
			System.out.println("It alaniniz ==>Busines Analyst");
		}else if (alan.toLowerCase().equals("pm")) {
			System.out.println("It alaniniz ==>Projekt Manager");
			
		}else {
			System.out.println("Lutfen gecerli bir kod giriniz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	Scanner input = new Scanner (System.in);
		System.out.println("qa\ndev\nba\npm\nLutfen mesleginizi giriniz :");
		String jobTitle=input.next();

		String qa="Qualty Analyst";
		String dev = "Developer";
		String ba = "Business Analyst";
		String pm = "Project Manager";

		if(jobTitle.equalsIgnoreCase("qa")) {
			System.out.println("Mesleginiz: " + qa);

		}else if (jobTitle.toLowerCase().equals("dev")) {
			System.out.println("Mesleginiz: " + dev);
		}else if (jobTitle.toLowerCase().equals("ba")) {
			System.out.println("Mesleginiz: " + ba);
		}else if (jobTitle.equalsIgnoreCase("pm")) {
			System.out.println("Mesleginiz: " + pm);
		}else {
			System.out.println("Hatali secim yaptiniz");
		}

		input.close();
*/


	}

}
