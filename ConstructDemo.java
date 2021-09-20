class ConstructDemo{
	static int studentCount;
	  
      int id;
	  String name;
	  String gender;
	  int age;
	  long phone;	  
	  double gpa;	  
	  char degree;
	  
	  boolean international;
	  double tuitionFees = 12000.0;
	  double internationalFees = 5000.0;
	   
	  ConstructDemo(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, 
					char newDegree) {
		  id = newId;
		  name = newName;
		  gender = newGender;
		  age = newAge;
		  phone = newPhone;
		  gpa = newGpa;
		  degree = newDegree;
		 
		  
	  }
	  ConstructDemo(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, 
					char newDegree,  boolean isInternational) {		  
	      this(id, name.toUpperCase(), gender, age, phone, gpa, degree, false);	
		   international = isInternational;
		  
		  studentCount = studentCount + 1;
		  int nextId = id + 1;
		  if (international) {
		      tuitionFees = tuitionFees + internationalFees;
			  //return;
		  }	
		  if(gpa > 3.5){
			  tuitionFees = tuitionFees - 10;
		  }
		  
	      System.out.println("\nid: " + id);
		  System.out.println("nextId: " + nextId);
		  System.out.println("name: " + name);
		  System.out.println("gender: " + gender);
		  System.out.println("age: " + age);
		  System.out.println("phone: " + phone);
		  System.out.println("gpa: " + gpa);
		  System.out.println("degree: " + degree);
		  System.out.println("tuitionFees: " + tuitionFees);
		  System.out.println("studentCount: " + studentCount);
	  }
	   ConstructDemo() {}
	

	  public static void main(String[] args) {
	      ConstructDemo student1 = new ConstructDemo(1000, "Putul", "female", 18, 223_456_7890L, 3.8, 'B');
		  
		  ConstructDemo student2 = new ConstructDemo(1001, "Ashu", "male", 21, 223_456_9999L, 3.4, 'M',true);
		  
		  ConstructDemo student3 = new ConstructDemo(1002, "Ravikant", "female", 20, 223_456_8888L, 4.0, 'M',true);
		  
		  // ConstructDemo student4 = new ConstructDemo();
		  
		  System.out.println("ConstructorOverloading.studentCount: " + ConstructDemo.studentCount);
	  }
}
	  