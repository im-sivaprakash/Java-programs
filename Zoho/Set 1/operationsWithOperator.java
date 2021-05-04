import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static int calc(int b,char opr,int a)
   {
     int sum = 0;
     switch(opr)
     {
       case '+':
         sum = a+b;
         break;
       case '-':
         sum = a-b;
         break;
       case '*':
         sum = a*b;
         break;
       case '/':
         sum = a/b;
         break;
     }
     System.out.println("calc==>"+sum);
     return sum;
   }
   
   public static void main(String args[])
   { 
    String input = "374291 - - * + -";
    int sum = 0;
    ArrayList<Integer> number = new ArrayList<Integer>();
    ArrayList<Character> opr = new ArrayList<Character>();
    
    for(int i=0; i<input.length();i++)
    {
      if(input.charAt(i)>='0' && (input.charAt(i)<='9'))
       number.add(input.charAt(i)-48);
      else
       if(input.charAt(i)!=' ')
       opr.add(input.charAt(i));
    }
    
    int opIndex = 0;
    for(int i=1;i<number.size();i++)
    {
      
      if(i==1)
      {
        System.out.println(number.get(0)+" "+opr.get(opIndex)+" "+number.get(i));
        sum = calc(number.get(0),opr.get(opIndex),number.get(i));
      }
      else
      {
        System.out.println(sum+" "+opr.get(opIndex)+" "+number.get(i));
        sum = calc(sum,opr.get(opIndex),number.get(i));
      }
      
      
      opIndex++;
    }
    
 
    
   System.out.print("Total===>"+sum);
   
   }
 }