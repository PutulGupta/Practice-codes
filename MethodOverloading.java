class MethodOverloading{
	public void  m1(){
		System.out.println("Without arguments...");
	}
	public void  m1(int a){
		System.out.println("Integer argument types..." + a);
	}
	public void  m1(double d){
		System.out.println("Double argument types..." + d);
	}
	/*static void  m1(double d){
		System.out.println("Double argument types..." + d);  CE:method is already defined
	}*/
	public static void main(String[] args){
		MethodOverloading obj = new MethodOverloading();
		obj.m1();
		obj.m1(10);
		obj.m1(10.5);
		obj.m1('a');  //resolution always takes care by compiler ie compile time polymorphism.
		obj.m1(20.5);
	}
	
		
	
}
