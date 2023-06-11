/*1. Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:The smallest value is 25.0
*/

import java.util.Scanner;
class Func1{
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter First Value");
	int a = scanner.nextInt();
	System.out.println("Enter Second Value");
	int b = scanner.nextInt();
	System.out.println("Enter Third Value");
	int c = scanner.nextInt();
	if(a<b)
	{
		if(c<a)
		System.out.println("C is Smallest"+ c);
		else
		System.out.println("A is Smallest"+ a);
	}
	else
	{
	if(b<a)
		System.out.println("B is Smallest"+ b);
	else
		System.out.println("A is Smallest"+ a);
	}
    }
}



 
