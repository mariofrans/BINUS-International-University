package PracticeClasses;

class EmployeeClass 
{
	public static void main(String[]args)
	{
		Employee mario = new Employee(10001, "Mario", "Frans", 2000);
	
		System.out.println("His/her ID is: "+ mario.getID());
		System.out.println("His/her first name is: "+ mario.getFirstName());
		System.out.println("His/her last name is: " + mario.getLastName());
		System.out.println("His/her full name is: " + mario.getName());
		System.out.println("His/her salary is: " + mario.getSalary());
		System.out.println("His/her annual salary is: " + mario.getAnnualSalary());
		System.out.println("His/her raised salary is: " + mario.raiseSalary(10));
	}
}

class Employee
{
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	Employee(int id, String firstName, String lastName, int salary)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getID()
	{
		return this.id;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public String getName()
	{
		return lastName+" "+firstName;
	}
	
	public int getSalary()
	{
		return this.salary;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	public int getAnnualSalary()
	{
		return salary*12;
	}
	public int raiseSalary(int percent)
	{
		return ((100+percent)/100)*salary;
	}
	
}
