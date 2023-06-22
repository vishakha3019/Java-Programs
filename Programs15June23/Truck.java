class Truck extends Vehicle{

	public void fuel(String a)
	{	
		System.out.println("Fuel type is:" +a);
	}
	public static void main(String args[])
	{
		Truck function = new Truck();
		function.fuel("Petrol");
		function.make("Tata");
		function.model("Base");
		function.year(2022);
	}
			}