import java.util.*;
class ArraysDemo{
	static void arrays(){
		 System.out.println("\nInside arrays...");
		 /*int[] scores = new int[5];
		 
		 scores[0] = 90;
		 scores[1] = 80;
		 scores[2] = 60;
		 scores[3] = 70;*/
		 
		 //int[] scores = new int[]{90,70,80,95};
		 
		 int[] scores = {90,70,80,95};
		 
		System.out.println("Term1:" + scores[0]);
		System.out.println("Term2:" + scores[1]);
		System.out.println("Final:" + scores[2]);
		System.out.println("Projects:" + scores[3]);
		
		
		
		
	 }
	 static void go(int[] arr){
			System.out.println("arr[0]:" +arr[0]);
			System.out.println("arr[1]:" +arr[1]);
			arr[1] = 22;
	 }
	 public static void main(String[] args){
		 arrays();
		 int[] arr = {1, 2};
		 go(arr);
		 System.out.println("After updation arr[1]:" +arr[1]);
	 }
}
