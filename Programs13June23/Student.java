class Student{
	String name;
	public Student()
		{
		name =  "Unknown";
		System.out.println("The name is Unknown !");
		}
	public Student(String name)
		{
		this.name = name;
		System.out.println("The name is : "+name);
		}
	public static void main(String args[])
		{
		Student s1 = new Student();
		Student s2 = new Student("Vishakha");
}
}