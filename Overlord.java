public class Overlord extends Supervisor
{

   int vacation;
   
   public Overlord(String n, String i, int s, int v){
      super(n, i, s); //call to the Supervisor constructor
      vacation = v;
   }

   public String toString(){
      return super.toString() + "\nVacation: " + vacation;
   }
}