public class PersonnelFactory {

	public static Person getPersonnel(int type, String last, String first, String middle )
	{
	     switch(type)
	     {
	        case 1:
	        return  new Person(last, first, middle);
	        //break;

	        case 2:
	        return new Employee(last, first, middle);
	        //break;
	        
	        case 3: 
	        return new Executive(last, first, middle);
	        
	        case 4:
	        return new Security(last, first, middle);
	        
	        case 5: 
	        return new Volunteer(last, first, middle);

	        default:
	        return null;

	     }

	}
}