import java.util.ArrayList;
import java.util.Scanner;

public class Company 
{
	static Scanner k = new Scanner (System.in);
	static ArrayList<Intern> stuffListToUse = new ArrayList<Intern> ();
	
	public static void main(String[] args)
	{
		ArrayList<Intern> people = new ArrayList<Intern> ();
		int input = 0;
		
		while ( true ) 
		{
			System.out.println ("1 - Add New stuff");
	        System.out.println ("2 - Display All stuff");
	        System.out.println ("3 - Promote All stuff");
	        System.out.println ("4 - View stuff");
	        System.out.println ("5 - Quit");
	         
	         input = k.nextInt ();
	         
	         if(input == 1){
	        	 people.add ( createStuff () );
	         }else if(input == 2){
	            displayAllStuff (people);
	         }else if(input == 3){
	            promoteAllStuff (people);
	         }else if(input == 4){
	            displayAllStuff (stuffListToUse);
	         }else if(input == 5){
	            break;
	         }
		}
	}
	
	public static Intern createStuff () 
	{
	      //clear out buffer
	      k.nextLine ();
	      
	      String name;
	      int grade;
	   
	      System.out.println("Enter Stuff Name: ");
	      name = k.nextLine ();
	      System.out.println("Enter Stuff Grade: ");
	      grade = k.nextInt ();
	      
	      return new Intern (name, grade);
	}
	
	public static void displayAllStuff (ArrayList<Intern> list) 
	{
	      for(int i = 0; i < list.size(); i++){
	         System.out.println ( list.get(i) );
	      }
	      System.out.println ();
	}
	public static void promoteAllStuff (ArrayList<Intern> list) {
	      for (int i = list.size() - 1; i >= 0; i--){
	         if(list.get(i).promote() == 13){
	            Intern s = list.remove(i);
	            System.out.println("Removing: " + s.getName() );
	            s.setGradYear (2015);
	            stuffListToUse.add (s);
	            
	         }
	      }
	   }
}
