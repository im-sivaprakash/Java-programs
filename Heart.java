/*
OUT PUT : in love 

   * * *   * * *  
 *       *       *
 *               *
 *               *
   *           *  
     *       *    
       *   *      
         *    
         
   * * *   * * *  
 *       *       *
 *      SS       *       //PAIR LETTERS
 *               *
   *           *  
     *       *    
       *   *      
         *         
         
         
 */

public class Heart {

	public static void main(String[] args) {
		int i=0 , j=0, x=9;
		
        
        
        
        for(i=1;i<=3;i++)
		{
			for(j=1;j<=9;j++)
			{
				if(i==1)
				{
				  if(j==1)
				  System.out.print("  ");
				  else if(j==(9/2)+1)
				  System.out.print("  ");
				  else if(j==9)
				  System.out.print("  ");
				  else
				  System.out.print(" *");
				}
				else if(i==2)
				{
				  if(j==1)
				   System.out.print(" *");
				  else if(j==(9/2)+1)
				   System.out.print(" *");
				  else if(j==9)
					   System.out.print(" *");
				  else
				   System.out.print("  ");
				}
				else if(i==3)
				{
				  if(j==1)
				   System.out.print(" *");
				  else if(j==9)
					   System.out.print(" *");
//				  else if(j==(9/2)+1)            //PAIR LETTERS
//					   System.out.print("SS");
				  else
				   System.out.print("  ");
				}
				else
			    System.out.print("  ");
				
			}
			System.out.println();
		
		}
        
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=9;j++)
			{
				if(i==j)
				    System.out.print(" * ");
				else if(j==x)
					System.out.print("*");
				else
				System.out.print("  ");
			}
			System.out.println();
			x--;
		}
		

	}

}
