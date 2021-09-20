class ConstructorOverloading {
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
	  
	  ConstructorOverloading(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, 
					char newDegree) {		  
	      this(newId, newName.toUpperCase(), newGender, newAge, newPhone, newGpa, newDegree, false);		  
	  }
	  
	  ConstructorOverloading(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, 
					char newDegree,  boolean isInternational) {
		  id = newId;
		  name = newName;
		  gender = newGender;
		  age = newAge;
		  phone = newPhone;
		  gpa = newGpa;
		  degree = newDegree;
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
	  
	  ConstructorOverloading() {}
	

	  public static void main(String[] args) {
	      ConstructorOverloading student1 = new ConstructorOverloading(1000, "Putul", "female", 18, 223_456_7890L, 3.8, 'B');
		  
		  ConstructorOverloading student2 = new ConstructorOverloading(1001, "Ashu", "male", 21, 223_456_9999L, 3.4, 'M',true);
		  
		  ConstructorOverloading student3 = new ConstructorOverloading(1002, "Ravikant", "female", 20, 223_456_8888L, 4.0, 'M',true);
		  
		   ConstructorOverloading student4 = new ConstructorOverloading();
		  
		  System.out.println("ConstructorOverloading.studentCount: " + ConstructorOverloading.studentCount);
	  }


}
	