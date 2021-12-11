package _09_Arrays;

import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {
        //bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6
    	int istenenToplam = 9;
        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        for (int i = 0; i < arr.length; i++) {//arr kontrolu
            for (int j = i + 1; j < arr.length; j++) {//sorunun trick
                if (arr[i] + arr[j] == istenenToplam) {
                    System.out.println(arr[i] + " ile " + arr[j] + " toplamı : " + istenenToplam);
                }
            }
        }
    }
}
