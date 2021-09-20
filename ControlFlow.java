class ControlFlow{
	
	static void switchExample(){
		/*byte b = 10;
		final byte c = 11;
		byte d = 12;
		
		switch(b){
			case 127 : System.out.println("Inside Switch");
			     break;
			case c :  
			          break;
			//case d : break;
		}*/
		
		int month = 3;	
		switch(month){
			case 1:  System.out.println("January");
			      break;
			case 2:  System.out.println("February");
                   break;
			case 3:  System.out.println("March");
                   break;
             default :
                      System.out.println("Incorrect choice");
		}					  
	}
	static int min(int x, int y){
		return((x<y)? x:y);
	}
	public static void main(String[] args){
		switchExample();
		int min = min(7,5);
		System.out.println("min:"+min);
		
	}
}
			