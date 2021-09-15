class Student{
  // variable declaration
    int 1id;
    String name;
    String gender;
  //Method Defination
	boolean updateProfile(String newName)
	{
	   name=newName;
	   return true;
	}
}
class StudentTest{
  public static void main(String[] args)
   {  
	  //creating object of student class
	    Student s= new Student();
		
	  // setting student states
	   s.1id=1000;
	   s.name="Putal";
	   s.gender="Female";
	   
	  // updating profile with correct name
	   s.updateProfile("Putul");
	}
}  	
	  