class Employee extends Person{
	int a;
	public int getEmployeeId(int b)
	{
		a=b;
		System.out.println("Employee Id is:"+a);
		return 0;
	}
	public static void main(String args[])
	{
		Employee function = new Employee();
		function.getEmployeeId(229);
		function.getFirstName("Rushant");
		function.getLastName("Koushal");
	}
}