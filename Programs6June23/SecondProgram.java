/* 2. Split a float number into its integer and decimal part
Eg 94.64
integer 94, decimal value = .46
*/

import java.util.Scanner;

public class SecondProgram {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the float value ");
        float a = scanner.nextFloat();
        int b = (int) a;
        System.out.println("Integer value " + b);
        float c = a - b;
        System.out.println("Decimal number " + c);
    }
}