/*
 Classname --- m1_2palindrome
 Version info 1
 Copyright --- Klymenko Sergij ONPU
*/

import java.util.Scanner;

public class m1_2palindrome {

    public static void main(String[] args) {

        m1_2palindrome pal = new m1_2palindrome();

        /*Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String wort = scan.nextLine();*/

        String word = " 5mAa m5";

        String wort = word
                .toLowerCase()
                .trim()
                .replaceAll(" ", "")
                .replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll(";", "")
                .replaceAll(":", "")
                .replaceAll("\\(", "")
                .replaceAll("\\)", "")
                .replaceAll("\"", "")
                .replaceAll("\\?", "")
                .replaceAll("\\!", "")
                .replaceAll("\\n", "")
                .replaceAll("\\d", "")
                ;

        if (pal.isPal(wort)) {
            System.out.println("palindrome actually");
            System.out.println(wort);
        } else {
            System.out.println("not a  palindrome really");
            System.out.println(wort);
        }

    }

    public boolean isPal(String woort) {
        int i = woort.length()-1;
        int j = 0;
        while(i > j) {
            if(woort.charAt(i) != woort.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

}
