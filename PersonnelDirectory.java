import java.util.*;
public class PersonnelDirectory{
	
	
    Scanner scan = new Scanner(System.in);
	public ArrayList<Person> personnelList;

	

	public PersonnelDirectory() {
	   personnelList = new ArrayList<Person>();
	}

	public void addPersonnel()
	{
		System.out.println("Please select Personnel type: 1. Person 2. Employee 3. Executive 4. Security 5. Volunteer ");
	    int type = scan.nextInt();
	    
	    scan.nextLine();
		System.out.println("Enter first name: ");
		String firstN = scan.nextLine();
		System.out.println("Enter last name: ");
		String lastN = scan.nextLine();
		System.out.println("Enter middle name: ");
		String middleN = scan.nextLine();
		
		switch (type) 
		{
			case 1 :
	    	Person p = PersonnelFactory.getPersonnel(1, lastN, firstN, middleN);
	    	personnelList.add(p);
		    break;
		
		    case 2:
		    System.out.println("Enter empploy id : ");
	     	int empID = scan.nextInt();
		    System.out.println("Enter base salaey" );
	    	double salary = scan.nextDouble();
	    	Person e = PersonnelFactory.getPersonnel(2, lastN, firstN, middleN);
        
            //e.setID(empID);
            //e.setSalary(salary);
        
	    	personnelList.add(e);
	    	
	  	    break;	
		    
		    case 3:
		    Person et = PersonnelFactory.getPersonnel(3, lastN, firstN, middleN);
	    	personnelList.add(et);
		    break;	
		    
		    case 4:
		    Person s = PersonnelFactory.getPersonnel(4, lastN, firstN, middleN);
	    	personnelList.add(s);
		    break;	
		    
		    case 5:
		    Person v = PersonnelFactory.getPersonnel(5, lastN, firstN, middleN);
	    	personnelList.add(v);
		    break;	
		    
		    
		}
	}
	
	
    public int getTotalObjects() {
    	return personnelList.size();
    }
    
    public void findPersonel() {
    	System.out.println("Enter first name: ");
		String firstN = scan.nextLine();
		System.out.println("Enter last name: ");
		String lastN = scan.nextLine();
		System.out.println("Enter middle name: ");
		String middleN = scan.nextLine();

    	for(int i = 0; i < personnelList.size(); i++) {
    		
    		if(personnelList.get(i).getFirst().equals(firstN) && personnelList.get(i).getLast().equals(lastN) && personnelList.get(i).getMiddle().equals(middleN)) {
    			System.out.println("found");
    			System.out.println(personnelList.get(i).getFirst() + " " + personnelList.get(i).getMiddle() + " " + personnelList.get(i).getLast());
    			return;
    		}
    	}
  
    	System.out.println("Not found.");
    	Person p = PersonnelFactory.getPersonnel(1, lastN, firstN, middleN);
	    personnelList.add(p);
    
    }
    
    
    public void displayPersonnelOrder0() {
     	for(int i = 0; i < personnelList.size(); i++) 
    		System.out.println(personnelList.get(i).getFirst() + " " + personnelList.get(i).getMiddle() + " " + personnelList.get(i).getLast());
   
    }  
    
    public void displayPersonnelOrder1() {
     	for(int i = 0; i < personnelList.size(); i++) 
    		System.out.println(personnelList.get(i).getLast() + ", " + personnelList.get(i).getMiddle() + " " + personnelList.get(i).getFirst());
 
    }  
    
    public void displayPersonnelOrder2() {
     	for(int i = 0; i < personnelList.size(); i++) 
    		System.out.println(personnelList.get(i).getLast() + ", " + personnelList.get(i).getFirst() + " " + personnelList.get(i).getMiddle());
    
    } 
    

}