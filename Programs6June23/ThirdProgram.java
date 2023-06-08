/* 3. Addition of 3 variables of float type and store it in int and double type variable */

import java.util.Scanner;

public class ThirdProgram{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first float value ");
        float a = scanner.nextFloat();
        
        System.out.println("Enter the second float value ");
        float b = scanner.nextFloat();
        
        System.out.println("Enter the third float value ");
        float c = scanner.nextFloat();
         
        float d = a+b+c;
        int InInt = (int) d;
        double InDouble = (double) d;

        System.out.println("Addition of 3 variables:" + d);
        System.out.println("WithInInt:" + InInt );
        System.out.println("WithInDouble:" + InDouble );
    }
}