package practice2;

import java.util.Scanner;

public class TwoNumbers {
    public static void main (String[] args){

        // Two numbers
        int q = 21;
        int w = 8;

        // calculation

        int calc1 = q / w;
        int remainder = q % w;

        //Display result
        System.out.println(q+"/"+ w + " = " + calc1 + " and the remainder is : " + remainder);

    }
}
