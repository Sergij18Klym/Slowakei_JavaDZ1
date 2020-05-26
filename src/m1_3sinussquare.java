/*
 Classname --- m1_3sinussquare
 Version info 1
 Copyright --- Klymenko Sergij ONPU
*/

import java.util.Scanner;

public class m1_3sinussquare {

    public static void main(String[] args) {

        double pi = Math.PI;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int scanned = scan.nextInt();
        double y = 0.1 * scanned;

        double x1 = Math.asin(y);
        double x2 = pi - x1;

        double s1 = -(Math.cos(x1) - Math.cos(0));
        double s2 = (x2 - x1) * y;
        double s3 = s1;

        double s = s1+s2+s3;

        System.out.println("your figure area: " + s);
    }

}