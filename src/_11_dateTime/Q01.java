package _11_dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q01 {

	public static void main(String[] args) {
	//	String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
	//	System.out.println(date);
		//what is the result ?

		/*
		 * A) May 04, 2014T00:00:00:000
		 * 
		 * B) 2014-05-04T00:00:00:000
		 * 
		 * C) 5/4/14T00:00:00:000
		 * 
		 * D) An exception is throw at runtime
		 */
		StringBuilder sb1 = new StringBuilder("OCAJP8");

		sb1.subSequence(2, 4);

		sb1.deleteCharAt(3);

		sb1.reverse( );

		System.out.println(sb1);


	
		
	}
}
