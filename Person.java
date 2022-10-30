public class Person {
	private String last;
	private String first;
	private String middle;


	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;

	}
	
	 public String getLast() {
    	return this.last;
    }
    
     public String getFirst() {
    	return this.first;
    }
    
     public String getMiddle() {
    	return this.middle;
    }


}