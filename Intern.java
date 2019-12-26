
public class Intern 
{
	private int grade, gradYear;
	private String name;
	
	public Intern (String n, int g)
	{
	      name = n;
	      grade = g;
	      gradYear = 0;
	}
	   
	public int promote () 
	{
	      return ++grade;
	}
	public String getName () 
	{
	      return name;
	}
	public void setGradYear (int y)
	{
	      gradYear = y;
	}
	   
	public String toString () 
	{
	      if(grade < 13){
	         return "Name: " + name + "\nGrade: " + grade;
	      }else{
	         return "Name: " + name + "\nGrad Year: " + gradYear;
	      }
	}
}
