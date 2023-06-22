class Child extends Parent{
	public void Output()
	{
		System.out.println("This is Child Class !");
	}
	public static void main(String args[])
	{
	Child function = new Child();
	Parent function1 = new Parent();
	function.Output();
	function1.Output1();
	function.Output1();
	}
}