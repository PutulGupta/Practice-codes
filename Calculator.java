import java.util.Scanner;
import java.util.*;
class Calculator{
	public static void main(String[] args){
		char operator;
		double num1, num2, result;
		
		Scanner value = new Scanner(System.in);
		
		System.out.println("Choose any operator: +, -, *, /, or %");
		operator = value.next().charAt(0);
		
		
		System.out.println("Enter first number:");
		num1 = value.nextDouble();
		
		System.out.println("Enter second number:");
		num2 = value.nextDouble();
		
		switch(operator){
			
			case '+':
			     result = num1 + num2;
				 System.out.println(num1 + num2 +"="+ "result");
				 break;
				 
			case '-':
			     result = num1 - num2;
				 System.out.println(num1 - num2 +"="+ "result");
				 break;	 
				 
			case '*':
			     result = num1 * num2;
				 System.out.println(num1 * num2 +"="+ "result");
				 break;	

			case '/':
			     result = num1 / num2;
				 System.out.println(num1 / num2 +"="+ "result");
				 break;	 
				 
			case '%':
			     result = num1 % num2;
				 System.out.println(num1 % num2 +"="+ "result");
				 break;	

			default:
                System.out.println("Invalid Operator!!! Please choose a valid operator to perform task");	
		        break;
		}
    value.close();	
	}
}	
			
			
