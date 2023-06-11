/* 3. Write a program to reverse a number and find the average of reversed number. */

import java.util.Scanner;
class Program3{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to be reversed:");
		int a = scanner.nextInt();
		int rev,s=0,sum=0;
		
		for(;a>0;a=a/10)
		{	
			rev=a%10;
			sum=(sum*10)+rev;
		}
		
		System.out.println("Reversed Number is:"+sum);
						}
}