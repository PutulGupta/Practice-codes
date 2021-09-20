class VariablesScope{
    int computeCount;
	int id;
	String name;
	String gender;
	int age;
	long phone;
	double gpa;
	char degree;
	
	
	boolean international ;
    double tutionFees = 12000.0;
	double internationalFees = 5000.0;

    void compute(){
         computeCount = computeCount + 1;
		 int nextId = id + 1;
		 
		 
		 
		 if(international){
			 tutionFees = tutionFees + internationalFees;
		 }
		 System.out.println("\nid: " + id);
		 System.out.println("nextId: " + nextId);
		 System.out.println("name: " + name);
		 System.out.println("gender: " + gender);
		 System.out.println("age: " + age);
		 System.out.println("phone: " + phone);
		 System.out.println("gpa: " + gpa);
		 System.out.println("degree: " + degree);
		 System.out.println("tutionFees: " + tutionFees);
		 System.out.println("computeCount: " + computeCount);
	}
	public static void main(String[] args){
		VariablesScope vs1 = new VariablesScope();
		vs1.id = 1000;
		vs1.name = "John";
		vs1.gender = "male";
		vs1.age = 18;
		vs1.phone = 223_456_7890L;
		vs1.gpa = 3.8;
		vs1.degree = 'B';
		vs1.international = false;
		vs1.compute();
		
		VariablesScope vs2 = new VariablesScope();
		vs2.id = 1001;
		vs2.name = "Devilliers";
		vs2.gender = "male";
		vs2.age = 30;
		vs2.phone = 223_456_9999L;
		vs2.gpa = 3.4;
		vs2.degree = 'D';
		vs2.international = true;
		vs2.compute();
		
		
		VariablesScope vs3 = new VariablesScope();
		vs3.id = 1002;
		vs3.name = "John";
		vs3.gender = "male";
		vs3.age = 18;
		vs3.phone = 223_456_7890L;
		vs3.gpa = 3.8;
		vs3.degree = 'B';
		vs3.international = false;
		vs3.compute();
		
		//System.out.println(" Student.computeCount: " + vs1.computeCount);
	}
}	