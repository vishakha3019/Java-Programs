/*3.      *
         **
        ***
       ****
*/
class Pattern3{
	public static void main(String args[]){
	int i,j;
	for(i=0;i<4;i++){
		for(j=(4-i);j>=0;j--){
			System.out.print(" ");
		}
	for(j=0;j<=i;j++){
	 	System.out.print("*");
	}
	System.out.println();
}
}}