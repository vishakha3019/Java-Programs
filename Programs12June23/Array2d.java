import java.util.Scanner;
	class Array2d{
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	int[][] a = new int[2][2];
	int[][] b = new int[2][2];
	System.out.println("Enter values of 2*2 matrix 1st:");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.println("Values at position" +i+j+"is:");
			a[i][j] = scanner.nextInt();
		}
	}
	System.out.println("Enter values of 2*2 matrix 2nd:");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
    			System.out.println("Values at position" +i+j+"is:");
			b[i][j] = scanner.nextInt();
		}
	}
	int[][] c = new int[2][2];
	for(int i=0;i<2;i++)
	{
    		for(int j=0;j<2;j++)
    		{
       			c[i][j]=a[i][j]+b[i][j];
        		System.out.println(c[i][j]+" ");
    		}
   	 System.out.println(" ");
	}
    }
}



