/*
 Classname --- m1_3sinussquare
 Version info 1
 Copyright --- Klymenko Sergij ONPU
*/

import java.util.Scanner;

public class m1_3sinussquare {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int scanned = scan.nextInt();
        String y1 = "0." + scanned;
        double y = Double.valueOf(y1);
        
        double pi = Math.PI;
        double dx = 0.1;
        double area = 0;
        double rectangle = 0;

        for (double x = 0; x < pi; x+=dx) {
            if (Math.sin(x) < y) {
                rectangle = Math.sin(x)*dx;
            } else {
                rectangle = dx * y;
            }
            area += rectangle;
        }

        System.out.println(area);

        /*
        double x1 = Math.asin(y);
        double x2 = pi - x1;

        double s1 = -(Math.cos(x1) - Math.cos(0));
        double s2 = (x2 - x1) * y;
        double s3 = s1;

        double s = s1+s2+s3;

        System.out.println("your figure area: " + s);
        */
    }
}