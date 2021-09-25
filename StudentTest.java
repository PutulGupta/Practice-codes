package eclipsetest;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] studentIds = new int[] {1001, 1002, 1003};
		
		StudentTest s1 = new StudentTest(studentIds[0], "Putul", "Female");
		StudentTest s2 = new StudentTest(studentIds[1], "Shabbu", "Female");
		StudentTest s3 = new StudentTest(studentIds[0], "Sourav", "Male");

		System.out.println("Name of student1:" + s1.getName());
		System.out.println("Name of student2:" + s2.getName());
		System.out.println("Name of student3:" + s3.getName());
		
		s1.setName("Shalini");
		System.out.println("Updated ame of student1:" + s1.getName());
		
		System.out.println("Number of student created:" + s.getStudentCount());
		

	}

	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}

}
