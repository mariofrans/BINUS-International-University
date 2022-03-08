package Java_Sem2;

public class Person
{
	private String name;
	private int age;
	private String gender;
	
	public Person(int age, String name, String gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void setAge()
	{
		this.age = age;
	}
	
	public String getAge()
	{
		return String.valueOf(age) +"th";
	}

}