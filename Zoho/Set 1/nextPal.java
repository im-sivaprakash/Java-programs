import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static boolean isPal(int num)
   {
     int revNum = 0;
     int safe = num;
     while(num!=0)
     {
       revNum = revNum * 10 + num%10;
       num /= 10;
     }
     
     return safe==revNum ? true : false ;
   }
   public static void main(String args[])
   { 
     
     int input = 2133;
     boolean run = true;
     input++;
     while(run)
     {
       if(isPal(input))
       {
         run = false;
         System.out.print(input);
       }
       else
       {
         input++;
       }
       
     }
   }
 }
// output : 2222