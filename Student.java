class Student{
	
	int id = 1000;
	int nextId=id+1;
	
	void compute(){
		System.out.println("id:"+id);
		System.out.println("nextId:"+nextId);
	}
    public static void main(String[] args){
        Student s1= new Student();	
        s1.compute();
	}
}	
