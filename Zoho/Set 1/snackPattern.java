import java.util.*;

//Compiler version JDK 11.0.2

class Dcoder
{  
  public static void main(String args[])
  {  
    int n = 4;
    int count = 1;

   for(int i=0;i<n;i++)
   {
       for(int j=n-1;j>i;j--)
         System.out.print("     ");
       
  
       for(int k=0,tempCount=count;k<n && i%2==0;k++)
          System.out.print(tempCount+++"  ");
       
            
        
      for(int k=0,tempCount=count+n-1;k<n && i%2!=0;k++)
           System.out.print(tempCount--+"  ");
              
        
       count+=n;
        
           
       System.out.println();
   }
  }
}

/*
  output
  
  
                 1  2  3  4  
          8  7  6  5  
     9  10  11  12  
16  15  14  13  

  */