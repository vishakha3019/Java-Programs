/*2. Suppose you have a Piggie Bank with an initial amount of $50 and you have to add some more amount to it. Create a class PiggieBandk with a data member named amount with an initial value of $50. Now make two constructors of this class as
follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to the Piggie Bank
3 - Repeat the addition in balance till 0 or negative value is entered

Create an object of the  AddAmount class and display the final amount in the Piggie Bank.
*/


import java.util.Scanner;
class AddAmount{
	int amount = 50;
	int bonus;
	AddAmount()
	{
	this.bonus = 0;
	System.out.println("Final Amount = $"+(amount+bonus));
	}
	AddAmount(int bonus)
	{
	this.bonus = bonus;
	System.out.println("Final Amount = $"+(amount+bonus));
	}
	public void Repeat()
	{
		int Total = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Amount to be Added:");
		for(int i = 0;;i++){
		int a = scanner.nextInt();
		if(a==0)
		{
			Total = (amount + a);
			break;
		}
		else
		{
			if(a==0)
			{
			Total = (amount + a);
			}
			else
			{
			Total = (amount+a);
			}
		}
		System.out.println("Updated Total Amount:"+Total);
		}
	}
	public static void main(String args[])
	{
	AddAmount obj1 = new AddAmount();
	AddAmount obj2 = new AddAmount(20);
	AddAmount function = new AddAmount();
	function.Repeat();
	}
	}