class Operators{
	//inc/dec operators with variables
	static void prePost(){
		int x = 5;
		--x;
		System.out.println("x:"+x);
		
		int y = ++x;
		System.out.println("y:"+y+"\nx:"+x);
	}
	//inc/dec operations with array
	static void prePostArr(){
		int index = 0;
		int[] array = new int[3];
		array[index] = 10;
		index++;
		//array[++index] = 10;
		
		array[index++] = 20;
		array[index++]= 30;
		
		System.out.println(index);
	}
	//compound arithmetic assignment
	static void compundArithmetic(){
		int x = 100;
		
		System.out.println("x+=5:"+(x += 5));
		System.out.println("x-=5:"+(x -= 5));
		System.out.println("x*=5:"+(x *= 5));
		System.out.println("x/=5:"+(x /= 5));
		System.out.println("x%=5:"+(x %= 5));
		
		int z = 57;
		
		System.out.println("\nz+=5:"+(z += 5));
		System.out.println("z-=5:"+(z -= 5));
		System.out.println("z*=5:"+(z *= 5));
		System.out.println("z/=5:"+(z /= 5));
		System.out.println("z%=5:"+(z %= 5));
	}
	//check number is even or odd
	static void oddEven(int num){
		if(num%2 == 0){
		System.out.println("\nNumber is even");
		}
		else{
		System.out.println("\nNumber is odd");	
		}
	}
	
	//Char type promotion
	static void charTypePromotion(){
		char ch1 = 50;
		System.out.println("\nValue of ch1:" + ch1);
		System.out.println("\nValue of 73-ch1:" +(73 - ch1));//char promoted to int
		
		System.out.println("\nValue of ch1 - 3:" + (ch1 - '3'));
	}
	static void unary(){
		int x = 1;
		System.out.println(x);
		
		int y = -x;
		System.out.println(y);
	}
	static void bitwiseOperator(){
		
		int x = 1;
		int y = 3;
		System.out.println("x & y:" +(x & y));
		System.out.println("x | y:" +(x | y));
		System.out.println("x ^ y:" +(x ^ y));
		System.out.println("~x:" +(~x));
		System.out.println("true & false:" +(true & false));
		
		char c1 = 'a';
		char c2 = 'b';
		System.out.println("c1 & c2:" +(c1 & c2));
		
		
		
	public static void main(String[] args){
		prePost();
		prePostArr();
		compundArithmetic();
		oddEven(50);
		charTypePromotion();
		unary();
	}
	
}