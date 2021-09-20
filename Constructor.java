class Constructor{
	int id=1000;
	Constructor(int newId){
		id = newId;
		System.out.println(id);
		if(id>1000){
			return;
		}
	}
	public static void main(String[] args){
		Constructor c = new Constructor(1000);
	}
}