/* 4. Write a Java method that accepts three integers and checks whether they are consecutive or not. Returns true or false. */

import java.util.Scanner;
class Func4{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
        	System.out.println("Enter Value 1:");
		int a = scanner.nextInt();
		System.out.println("Enter Value 2:");
		int b = scanner.nextInt();
		System.out.println("Enter Value 3:");
		int c = scanner.nextInt();
		System.out.println(test(a,b,c));
	}
	public static int test(int a, int b,int c)
	{
	int d = b - a;
	int e = c - b;
	if(d==1)
	{
		if(e==1)
		System.out.println("True");
		else
		System.out.println("False");
	}
	else
	{
	System.out.println("False");
	}
	return 0;
	}
}
