  class PrimitiveDataTypes{
 
     public static void main(String[] args){
		 
		 // Range of byte is -128 to 127 i.e. size of byte is 8-bits.
		  byte b=10;
          byte b1=127;
          //byte b2=128;
	    System.out.println(b);
		System.out.println(b1);
		//System.out.println(b2);
		
		int phone = 1234567890;//range[-2147483648 to 2147483647]
		//int phone1 = 2234567890;  //C.E :- Integer number too large.
		//int phone2 = 2234567890L;   C.E
		System.out.println(phone);
		
		
		long phone1 = 2234567890L;
		
		int minValue = Integer.MIN_VALUE;
		int maxValue = Integer.MAX_VALUE;
		System.out.println(minValue);
		System.out.println(maxValue);
		
		
		//Floating point data types
		float gpa = 3.8f;  //
		System.out.println(gpa);
		
		//Character data types 16-bit unsigned integer[0 to 65535]
		char ch = 'a';
		char degree = 'B';
		char degree1 = '\u0042';  // -> unicode values of character
		//char ch1 = 'ab';
		//char ch2 = "a";
		
		System.out.println(ch);
		//System.out.println(ch1);
		//System.out.println(ch2);  // incompatible types
		System.out.println(degree);
		System.out.println(degree1);
		
		
		
		
	}
}
	