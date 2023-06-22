class Car extends Vehicle{
	
	public void fuel(String a)
	{	
		System.out.println("Fuel type is:" +a);
	}
	public static void main(String args[])
	{
		Car function = new Car();
		function.fuel("Diesel");
		function.make("Tata");
		function.model("Ace");
		function.year(2020);
	}
}