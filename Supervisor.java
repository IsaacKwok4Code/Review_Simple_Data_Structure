public class Supervisor extends Employee
{

   private int salary;

   public Supervisor(String n, String i, int s){
      super (n, i); //call to the Employee constructor
      salary = s;
   }

   public String toString(){
      return super.toString() + "\nSalary: " + salary;
   }
   
   public double pay(){
      return salary / 12.0;   
   }

}