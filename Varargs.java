class Varargs{
	static void varargsMethod(boolean b, int... list){
		System.out.println("\n Inside varargs method");
		System.out.println("list.length: " + list.length);
	}
	/*static void foo(boolean b, char... ch){
		System.out.println("\n Inside foo method");
		System.out.println("length of b" + b.length);
		System.out.println("\nlength of char" + ch.length);
	}*/
	
	public static void main(String[] args){
		varargsMethod(true, 1, 2);
		varargsMethod(true, 1, 2,4, 5);
		//varargsMethod(true, 1, 2.5);
		
		//foo(false,'1', '2', '3');
	}
		
}
		