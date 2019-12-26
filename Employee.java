
public class Employee 
{
	private String name, id, age, department, jobTitle;
	
	public Employee(String n, String i)
	{
	      name = n;
	      id = i;
	}
	public String toString()
	{
	      return "Name: " + name + "\nID: " + id;
	}

	public double pay()
	{
	      return 0.0;
	}
}
