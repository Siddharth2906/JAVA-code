// Java Program for class example

class Student {
	// data member (also instance variable)
	int id;
	// data member (also instance variable)
	String name;

	public static void main(String args[])
	{

		Student s1 = new Student();
		s1.id=2;
		s1.name="siddharth";
		System.out.println("Id of user is:");
		System.out.println(s1.id);
		System.out.println("Name of user is:");
		System.out.println(s1.name);
	}
}