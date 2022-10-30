import java.util.Scanner;
public class PersonnelDirectoryUI
{

        public static PersonnelDirectory per = new PersonnelDirectory();

   public static void main(String[] args)
   {
             
	    Scanner scan = new Scanner(System.in);


      do{

          displayMenu();
          int choice = scan.nextInt();

          switch(choice)
          {
			  case 1:
		
	
		       per.addPersonnel();
		     

			  break;

			  case 2:
			  	
              per.findPersonel();
              
              break;

			  case 3:

			  System.out.println("Enter the order 0: first, middle,  last, 1: first, last, middle, 2: last, first , middle ");
			  int order = scan.nextInt();
			  
			  if(order == 0)
			    per.displayPersonnelOrder0();
			  if(order == 1)
			    per.displayPersonnelOrder1();
			  if(order == 2)
			    per.displayPersonnelOrder2();
			  
               break;

			  case 4:
			  System.out.println("Total Entries : " + per.getTotalObjects());

               break;
               
              case 5:
		      System.out.println("Exciting the program... ");
		      System.exit(0);

              default:
		      System.out.println("Invalid Input ");
		       
		  }

		 } while(true);


  }
  
  static void displayMenu() {
         System.out.println("Welcome to the Personnel Directory Management System");
          System.out.println("====================================================");

          System.out.println("\n\n\t 1. Add Personel");
          System.out.println("\n\t 2. Find Personel");
          System.out.println("\n\t 3. Print Names");
          System.out.println("\n\t 4. Number of Entries in the Directory");
          System.out.println("\n\t 5. Exit");

          System.out.println("\n\t Select one of the options above (1, 2, 3, 4, 5)");
  }

}