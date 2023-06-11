/* 2. Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
Test case
How many numbers you want to enter - 5
Enter number at 1 position - 2
Enter number at 2 position - 3
Enter number at 3 position - 1
Enter number at 4 position - 4
Enter number at 5 position - 8
Sum of even number is 14
Sum of odd number is 4
*/

import java.util.Scanner;
class Program2{
	public static void main(String args[])
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("How many numbers you want to enter:");
	int n = scanner.nextInt();
	int[] a = new int[n];
	int i,sumeven=0,sumodd=0;
	
	for(i=0;i<n;i++)
		{
		System.out.println("Enter number at"+i+"Position:");
		a[i] = scanner.nextInt();
		}

	for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
				{
					sumeven=sumeven+a[i];		
				}
			else
				{
					sumodd=sumodd+a[i];
				}
		}
		
		System.out.println("Sum of even number is:"+sumeven);
		System.out.println("Sum of odd numbers is:"+sumodd);
}
	}