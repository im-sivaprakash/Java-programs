import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
     int val = 153; //input 
     int rem = 0,sum = 0,temp = 0;
     int  num = val;
     while(num != 0)
     { 
       rem = num%10;
    
       temp += (rem*rem*rem); 
    
       sum +=temp;
       num /=10;
       temp = 0;   
     }
     
     if(sum==val)
     {
       System.out.print(val+" is Amstrong Number");
     }
     
   }
 }
 
 /* OUTPUT
  
153 is Amstrong Number

Process finished.
–----------+++++++++-------


153
 
 (Cube of the Numbers)
 1 - 1
 5 - 125
 3 - 27
  
  1+125+27 = 153 
 
 */