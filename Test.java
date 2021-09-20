class Test{
	int x = 10;
	int y;
	double d;
	boolean b;
	String s;
	
	public static void main(String[] args){
		/*System.out.println(x);  we can't access instance variable from 
		static area*/
		Test t = new Test();
		Test t1 = new Test();
		System.out.println(t.x);	// can be access by using object reference
		
		System.out.println(t1.y);   //0
		System.out.println(t1.d);   // 0.0
		System.out.println(t1.b);   //  false
		System.out.println(t1.s);   // Null
		/* for instance variables jvm takes always deafult value,
		no need to perform initilization explicitly*/
	}
}
  