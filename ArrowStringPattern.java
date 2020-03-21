

import java.util.Scanner;


public class ArrowStringPattern
{
	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
																					//aeplp
		String input = sc.nextLine();
	        
		StringBuilder str = new StringBuilder(input);
		
		String word = "";
       	      
	     if(str.length()%2==0)
	     {
	    	 word +=  str.substring(0, str.length()/2)+'v';
	    	 word +=  str.substring(str.length()/2,str.length());
	     }
	     else
	     {
	    	 word = str.toString();
	     }
	     int  start = 0;
	     
	     int  end = word.length()-1;
		
		for(int i = 0;i<(word.length()/2)+1;i++)
		{
			for(int j =0;j<word.length();j++)
			{
				
				
				
				if(j==start) 
					System.out.print(word.charAt(start));
				else if
				(j==end) 
					System.out.print(word.charAt(end));
				else 
					System.out.print(' ');
					
			}
			System.out.println();
			start++;
			end--;
		}
		
		
		
	}
}


/*
 Input :hello this is arrow pattern
 
 Output 
 
 
h                         n
 e                       r 
  l                     e  
   l                   t   
    o                 t    
                     a     
      t             p      
       h                   
        i         w        
         s       o         
                r          
           i   r           
            s a  
            
            */
 