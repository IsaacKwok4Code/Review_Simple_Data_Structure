public class Peon extends Employee
{

   private double wage, hours;
   
   public Peon(String n, String i, double w, double h){
      super(n, i);
      wage = w;
      hours = h;
   }
   
   public String toString(){
      return super.toString() + "\nWage: " + wage + "\nHours: " + hours;
   }
   
   public double pay(){
      return wage * hours;   
   }

}