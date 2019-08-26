/*==========================================================
 *STACK - Data structure:
 * A stack is a container of objects that are inserted and removed according to the last-in first-out (LIFO) principle.
 * A stack is a limited access data structure - elements can be added and removed from the stack only at the top.
 * push adds an item to the top of the stack, pop removes the item from the top.           
 *                 
 *                 OUTPUT
 Enter the size of the stack
4
===============================
Select the operation to perform
===============================
1.Push
2.Pop
3.Peek
4.View all Elements
5.Exit
1
Enter an Element to push
12
===============================
Select the operation to perform
===============================
1.Push
2.Pop
3.Peek
4.View all Elements
5.Exit
1
Enter an Element to push
13
===============================
Select the operation to perform
===============================
1.Push
2.Pop
3.Peek
4.View all Elements
5.Exit
1
Enter an Element to push
14
===============================
Select the operation to perform
===============================
1.Push
2.Pop
3.Peek
4.View all Elements
5.Exit
2
Poped Element is: 14
===============================
Select the operation to perform
===============================
1.Push
2.Pop
3.Peek
4.View all Elements
5.Exit
3
Peek Element is: 13
===============================
Select the operation to perform
===============================
1.Push
2.Pop
3.Peek
4.View all Elements
5.Exit
4
Stack Elements are 12 13
===============================
Select the operation to perform
===============================
1.Push
2.Pop
3.Peek
4.View all Elements
5.Exit
5
               
 *                 
 ===========================================================*/
import java.util.*;
public class stack {
    
	public   static  int top=-1;
    
    public  static boolean isfull(int size)   //to check the stack is Full;
    {
    	if(top==size-1)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
    
    
    public static  boolean isempty()        //to check the stack is Empty;
    {
    	if(top==-1)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
     
    public static void push(int stack[] , int size,int ele)   //push function
    {
    	if(isfull(size))
    	{
    		System.out.println("stack Overflow");
    	}
    	else
    	{
    		top++;
    		stack[top]=ele;
    		
    	}
    }
    
    
    public static int pop(int stack[])                   //pop function
    {
    	if(isempty())
    	{
    	System.out.println("stack underflow");
        return 0;
    	}
    	else
    	{
    	  top--;
    	  return stack[top+1];
         }
	
    }
    
    public  static int  peek(int stack[])
    {
    	if(isempty())
    	{
    		System.out.println("stack underflow");
    	    return 0;
    	}
    	else
    	{
    		return stack[top];
    	}
    }
    
    
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int n=sc.nextInt();
		int[] stack = new int[n];
		int s=1;
		while(s!=0)
		{
		
			System.out.println("===============================\nSelect the operation to perform\n===============================");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.View all Elements");
			System.out.println("5.Exit");
			
			
			int select=sc.nextInt();
			
			if(select==1)
			{   
				System.out.println("Enter an Element to push");
			    int ele = sc.nextInt();
				push(stack,n,ele);
			}
			else if(select==2)
			{
				System.out.println("Poped Element is: "+pop(stack));
				
			}
			else if(select==3)
			{
				System.out.println("Peek Element is: "+peek(stack));
			}
			else if(select==4)
			{
				System.out.print("Stack Elements are");
				for(int i=0;i<=top;i++)
				{
					System.out.print(" "+stack[i]);
				}
				System.out.println("");
			}
			else if(select==5)
			{
				s=0;
			}
		}
			
		
	}

}
