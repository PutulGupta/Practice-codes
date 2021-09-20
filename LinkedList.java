import java.util.*;
class LinkedList{
	public static void main(String[] args){
		
		
		LinkedList<String> ll = new LinkedList<String>();
		System.out.println("After inserting elements in Linked List:" + ll);
		ll.add(0,"Aman");
		ll.add(1,"Bittu");
		ll.add(2,"Chicku");
		ll.add(3,"Denny");
		ll.add(4,"Enny");
		System.out.println("After inserting elements in Linked List:" + ll);
		
		
		ll.set(1,"Sam");
		ll.set(4,"Garima");
		System.out.println("After updating elements in Linked List:" + ll);
		
		
		
		
	}
}

