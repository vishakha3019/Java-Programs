class Motorcycle extends Vehicle{
	
	public void fuel(String a)
	{	
		System.out.println("Fuel type is:"+a);
	}
	public static void main(String args[])
	{
		Motorcycle function = new Motorcycle();
		function.fuel("Petrol");
		function.make("Honda");
		function.model("New");
		function.year(2023);
	}
}