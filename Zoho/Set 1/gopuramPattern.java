import java.util.*;

//Compiler version JDK 11.0.2
/*
output:

       0       
      101      
     21012     
    3210123    
   432101234   
  54321012345  
 6543210123456 
765432101234567


*/
class Dcoder
{  
  public static void main(String args[])
  {  
    int n=8;
    for(int i=0;i<=n;i++)
    {
        for(int j=(n-1);j>=0;j--)
        {
            if(i>j)
            System.out.print(j);
            else
            System.out.print(" ");
        }
        
        for(int k=1 ; k<n; k++)
        {
           if(i>k)
            System.out.print(k);
            else
            System.out.print(" ");
        }
        
        System.out.println();
    }
  }
}
