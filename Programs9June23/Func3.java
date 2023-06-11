/* 3. Write a function to check whether the entered number is palindrome or not? */

import java.util.Scanner;
class Func3
{
	public static void main( String args[])
	{
	int rev,sum=0,temp;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Palindrome number");
	int a = scanner.nextInt();
	temp=a;
	for(;a!=0;a/=10)
	{
		rev=a%10;
		sum=(sum*10)+rev;
	}
	if(sum==temp)
	{
		System.out.println("It is a palindrome");
	}
	else
	{
		System.out.println("It is not a palindrome");
	}
    }
}
