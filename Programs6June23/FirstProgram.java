java /* 1. Input variables of following datatypes with Scanner
Integer
Float
Double
Char */

import java.util.Scanner;

public class FirstProgram {

    public static void main(String args[]) {
        int a;
        float b;
        double c;
        char d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer value");
        a = scanner.nextInt();
        System.out.println("Entered value of a = " + a);

        System.out.println("Enter float value");
        b = scanner.nextFloat();
        System.out.println("Entered float value is " + b);

        System.out.println("Enter double value ");
        c = scanner.nextDouble();
        System.out.println("Entered double value is " + c);

        System.out.println("Enter char value ");
        d = scanner.next().charAt(0);
        System.out.println("Entered double value is =" +d);

    }

}