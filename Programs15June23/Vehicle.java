class Vehicle{
	
	public void make(String a)
	{
		System.out.println("The vehicle is made by:"+a);
	}	
	public void model(String b)
	{
		System.out.println("The vehicle model is:"+b);
	}
	public void year(int c)
	{
		System.out.println("The vehicle was manufactured in:"+c);
	}
	public static void main(String args[])
	{
		Vehicle function = new Vehicle();
		function.make("Maruti Suzuki");
		function.model("Baleno");
		function.year(2023);
	}
}