public class Payroll{
   public static void main(String[] args){
   
      Employee[] workers = new Employee[4];
      
      workers[0] = new Supervisor("Bob", "001", 60000);
      workers[1] = new Overlord("Chase", "002", 3000000, 120);
      workers[2] = new Peon("Kevin", "003", 1.25, 600);
      workers[3] = new Peon("Bill", "004", 1.26, 599);
      
      for(int i = 0; i < workers.length; i++){
      
         System.out.println( workers[i].toString() );
         System.out.println( "Pay: " + workers[i].pay() );
         System.out.println( "--------------------------" );
   
      }
   
   
   }
}