class Swap{
	static int a = 20;
	static int b = 30;
	
	static void swap(int x, int y){
		int temp;
		temp=x;
		x=y;
		y=temp;
	}
	public static void main(String[] args){
		swap(a,b);
	}
}
	
   