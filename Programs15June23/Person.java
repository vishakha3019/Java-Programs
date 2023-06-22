class Person{
	String v;
	public String getFirstName(String a)
	{
		v = a ;
		System.out.println("The First Name is:"+v);
		return a;
	}
	String r;
	public String getLastName(String d){
		r = d ;
		System.out.print("The Last name is:"+r);
		return d;
	}
	public static void main(String args[])
	{
		Person function = new Person();
		function.getFirstName("Ashmit");
		function.getLastName("Tokhi");
	}
}