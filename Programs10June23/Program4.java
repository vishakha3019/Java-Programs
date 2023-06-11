/* 4. Write a function to calculate the power of a functions
Test Case
Enter the base number 2
Enter the exponent number 3
Result is 8
Test Case 2
Enter base number 3
Enter the exponent number 5
Result is 243 */

import java.util.Scanner;
class Program4{
	public static void main(String args[])
		{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter base value:");
		int base = scanner.nextInt();
		System.out.println("Enter power value:");
		int power = scanner.nextInt();
		int result = Result(base,power);
		System.out.println("Result-"+result);
		}

		public static int Result(int base,int power)
		{
		 	if(power==0)
			{
				return 1;
			}
			else
			{
				return base * Result(base,power-1);
			}					    
	        }
}		