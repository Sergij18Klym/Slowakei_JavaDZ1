/*
 Classname --- m1_1facts
 Version info 1
 Copyright --- Klymenko Sergij ONPU
*/

public class m1_1facts {

    public static void main(String[] args) {

        byte age = 22;
        String name = "Sergij";
        short height = 180;
        int invest = 7560;
        long cells = 10000000000L;

        float weigth = 62.4f;
        double ceiling = 2.8;
        char symb = '$';
        boolean chelovek = true;

        System.out.println("Mon nom est " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("My height is " + height + "cm");
        System.out.println("My weigth is " + weigth + "kg");
        System.out.println("Investors gave a " + invest + "$ funding for my project");
        System.out.println("I've got " + cells + " cells in my body");
        System.out.println("The height of my ceiling is " + ceiling + "m");
        System.out.println("USD == " + symb);
        if (chelovek == true) {
            System.out.println("I am a human being");}
        else {System.out.println("I am not a human being");}
    }
}
