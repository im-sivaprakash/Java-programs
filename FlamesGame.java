/*
=========
FLAMES
=========
Enter Boy Name
siva
Enter Girl Name
sindhu
FRIEND
*/


import java.util.Scanner;
public class FlamesGame {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("=========\nFLAMES\n=========");
		int index=0,index2=0,flag=0,len=0;
		
	    String f="flames";
	    System.out.println("Enter Boy Name");
		String boy = sc.next();
		 System.out.println("Enter Girl Name");
		String girl = sc.next() ;
		
		
		StringBuilder s1 = new StringBuilder(boy.toLowerCase());
		StringBuilder s2 = new StringBuilder(girl.toLowerCase());
		StringBuilder str = new StringBuilder("");
		StringBuilder fl = new StringBuilder(f);
		String temp ="";
		
		for(index=0;index<s1.length();index++)
		{   
			flag=0;
			for(index2=0;index2<s2.length();index2++)
			{
				if(s1.charAt(index)==s2.charAt(index2))
				{
					s2.deleteCharAt(index2)	;	
					flag=1;
				}
			}
				if(flag==1)
				s1.deleteCharAt(index);	
		}
		
		     str= s1.append(s2);
		     len=str.length();
		     
		
		     char charr =' ';
		     
		     while((fl.length())!=1)
		     {
		    	 int y=len%fl.length();
		    	 if(y!=0)
		    	 { 
		    		 temp=(fl.substring(0, y-1)+fl.substring(y));	
		    	 }
		    	 else
		    	 {   
		    		 temp=fl.substring(0,fl.length()-1);
		    	 }
		    
		    	 fl= new StringBuilder(temp);
		    	 charr=fl.charAt(0);
		    	 
		    	 
		     }
		  
		    	
		     
		     
		     switch(charr)
		     {
		    	 case 'f':
		    		 System.out.print("FRIEND");
		    		 break;
		    	 case 'l':
		    		 System.out.print("LOVE");
		    		 break;
		    	 case 'a':
		    		 System.out.print("AFFECTION");
		    		 break;
		    	 case 'm':
		    		 System.out.print("MARRIAGE");
		    		 break;
		    	 case 'e':
		    		 System.out.print("ENEMY");
		    		 break;
		    	 case 's':
		    		 System.out.print("SIBLINGS");
		    		 break;
		     }
		     
		     
	}

}



