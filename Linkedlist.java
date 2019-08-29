/*==========================================================
 * Linked List - Data structure:
 * A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations. The  
 * elements in a linked list are linked using pointers in C and Object in JAVA.                    
==========================================================*/    
  
public class Linkedlist {
	
	 static Node head = null;

	 static class Node{
			int data;
			Node next;
			Node(int d)
			{
				data=d;
				next=null;
			}
			
		}
	
	 /* Method to  insert Element At First */
	 public static Linkedlist insertAtFirst(Linkedlist list,int d)
	 {
		 Node newNode = new Node(d);
		 newNode.data=d;
		 if(head==null)
		 {
			 list.head=newNode;
			 return list;
		 }
		 
	    Node temp =  list.head;
	    head = newNode;
	    head.next = temp;
	   	  
		 return list;
	 }
	 
	 
	 /* Method to  insert Element At Last */
   public static void insertAtLast(Linkedlist list,int d)
	 {
		 Node newNode = new Node(d);
		 newNode.data = d;
		 
		 if(head==null)
		 {
			 list.head=newNode;
			
		 }
		 else {
		 Node n = list.head;
		 
		 while(n.next!=null)
		 {
			 n=n.next;
		 }
		 n.next=newNode;
		 }
		
		 
	 }
   
	 /* Method to  Add Element After the Element */
	public static Linkedlist addAfter(Linkedlist list,int perv,int d) 
	{
		Node newNode = new Node(d);
		newNode.data = d;
		Node n = Linkedlist.head;
		try {
		while(n.data!=perv)
		{
			n=n.next;
		}
		
		if(n.data==perv)
		{
			 newNode.next = n.next;
			 n.next = newNode;
		}
		}
		catch(Exception e) {
			System.out.println("There is no Data like : "+perv);
		}
			
		return list;	
	}
	

	 /* Method to  Add Element Before the Element */
	public static Linkedlist addBefore(Linkedlist list,int aft,int d) 
	{
		Node newNode = new Node(d);
		newNode.data = d;
		Node n = Linkedlist.head;
		Node perv = null;
		try {
		while(n.data!=aft)
		{    
			perv = n;
			n=n.next;
			
		}
			
	if(n.data==aft)
		{
		 newNode.next = perv.next;
		 perv.next = newNode;
      	}
		}
		catch(Exception e) {
			System.out.println("There is no Data like : "+aft);
		}
			
		return list;	
	}

	
	

	 /* Method to  view All Elements */
	 public static void print()
	 {
		 Node n = head; 
			
			while(n!=null)
			{
				System.out.print(n.data+" ");
			
				n=n.next;
				
			}
	 }
	 
	 /* Method to reverse the linked list */
	 public static void reversList(Linkedlist list)
	 {
		 Node prev = null;
		 Node current  = list.head;
		 Node next = null;
		 
		 while(current!=null)
		 {
			 next = current.next;
			 current.next = prev;
			 prev = current;
			 current = next;
			 
			 
		 }
		 
		 list.head = prev;
		 
	 }
	 
	 /* Method to find the MidVale of linked list */
	 public static void midElement(Linkedlist list)
	 {
		 Node n = Linkedlist.head; 
		 int count=0,trav=0;	
			while(n!=null)
			{
			  count++;
			  n=n.next;
			}
			count/=2;
			Node m = list.head;
			
			while(m!=null)
			{
				if(trav==count)
				  {
					  System.out.println("\nThe Mid Element of the list is : "+m.data);
				  }
				 m=m.next;	
				 trav++;
			}

			
	 }
	 
	 
	
	public static void main(String[] args) {
	
		     
		Linkedlist list = new Linkedlist();
		
//		Node head = new Node(1);
//		Node second = new Node(2);     insert Elements without Methods.
//		Node third = new Node(3);
//		head.next=second;
//		second.next = third;

		insertAtFirst(list,4);
	    insertAtFirst(list,3);
	    insertAtFirst(list,1);
	    
		print();               // 1 3 4 
		System.out.println();
	    
	     
		insertAtLast(list,5);       
		insertAtLast(list,6);
		
		print();               // 1 3 4 5 6 
		System.out.println();
		
	    addBefore(list,3,2);
	    addAfter(list,6,7);
		
		print();     
		System.out.println();  //1 2 3 4 5 6 7 
		
		midElement(list);      //The Mid Element of the list is : 4
		
		reversList(list);
		
		print();               //7 6 5 4 3 2 1 
		
		midElement(list);     //The Mid Element of the list is : 4

	}

}
