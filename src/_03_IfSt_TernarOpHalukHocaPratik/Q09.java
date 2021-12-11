package _03_IfSt_TernarOpHalukHocaPratik;

public class Q09 {

    public static void main(String[] args) {


        /*   45 degerinde bir double olusturun.
             Eger double 5'e bolununce kalan 0 ise ve double 8'e bolununce kalan 0 ise
             "able to divide by 5 and 8" yazdiriniz.

             Eger double 10'a  bolununce kalan 5 ise ve double 9'a  bolununce kalan 0 ise
             "able to divide by 9 and divide by 10 reminder is 5"  yazdiriniz.
         */

        
    	double deger=45;

    	if (deger%5==0 && deger%5==0) {
			System.out.println("able to divide by 5 and 8");
		} else if(deger%10==5 && deger%9==0){
				System.out.println("able to divide by 9 and divide by 10 reminder is 5");
		}else {
			System.out.println("bilemedim ne yazayim");
		}
    	
    	
    	
    	
    	
    	
    }
}
