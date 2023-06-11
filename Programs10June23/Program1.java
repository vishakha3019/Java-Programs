/* 1. Write a program to calculate the sum of first 10 natural number.
*/

public class Program1{
     public static void main(String args[]) {
       	int i ;
        int sum = 0;
        
        for(i=1;i<=10;i++){
             sum = sum+i;
        }
        System.out.println("Sum of 10 Natural Numbers: " + sum);
    }
}