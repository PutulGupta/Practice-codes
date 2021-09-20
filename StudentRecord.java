class StudentRecord{
	
	int id; 
	String name;
	String gender;
	int age;
	char grade;
	long phone;
	
	StudentRecord(int id, String name, String gender, int age, char grade, long phone){
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.grade = grade;
		this.phone = phone;
		
		
		System.out.println("\nName of Student:"+id);
		System.out.println("Name of Student:"+name);
		System.out.println("Name of Student:"+gender);
		System.out.println("Name of Student:"+age);
		System.out.println("Name of Student:"+grade);
		System.out.println("Name of Student:"+phone);
	}
	StudentRecord(){
	}
	
	public void updateProfile(String name){
		this.name = name;
	}
	
	
	public static void main(String[] args){
		StudentRecord s1 = new StudentRecord(1000,"Putul", "Female", 20 , 'A', 6201086484L);
		
		StudentRecord s2 = new StudentRecord(1001,"Ashutosh", "Male", 24 , 'B', 9123222097L);
		
		StudentRecord s3 = new StudentRecord(1000,"Amit", "Male", 22 , 'M', 6206167207L);
		
		s1.updateProfile("Shalini");
		System.out.println("\nUpdated name of student1:"+s1.name);
		
		/*StudentRecord s4 = s1;
		System.out.println("\nName of student4:"+s4.name);
		
		s4.updateProfile("Akriti");
		System.out.println("\nUpdated name of student4:"+s4.name);
		
		s4 = s2;
		System.out.println("\nName of student1:"+s4.name);
		
		s2 = s1;
		System.out.println("\nUpdated name of student4:"+s4.name);
		System.out.println("\nUpdated name of student2:"+s2.name);
		
		s4 = new StudentRecord();
		s4.updateProfile("Shiwani");
		System.out.println("\nNew name of student4:"+s4.name);
		System.out.println("\nName of student2:"+s2.name);
		System.out.println("\nUpdated name of student1:"+s1.name);*/
		
		StudentRecord[] stu = {s1, s2, s3};
		StudentRecord temp = stu[0];
		stu[0] = stu[2];
		stu[2] = temp;
		System.out.println("After swapping value of s1 and s2 and s3");
		System.out.println("\n Name of Student1:" +stu[0].name);
		System.out.println("\n Name of Student2:" +stu[1].name);
		System.out.println("\n Name of Student3:" +stu[2].name);
		
		
		
	}
}
		
