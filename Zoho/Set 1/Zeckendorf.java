import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    int input = 64;
    int a = 0,b = 1,c = 0 ,sum = 0;
    StringBuilder sb = new StringBuilder();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    
    while(input>a)
    {
      arr.add(a);
      c = a+b;
      a = b;
      b = c;
    }
    
    
    for(int i=arr.size()-1; i>0; i--)
    {
      
      if(arr.get(i)+sum <= input)
      {
        sum += arr.get(i);
        if(input==sum)
        sb.append(arr.get(i));
        else
        sb.append(arr.get(i)).append('+');
      }
      
    }
    
    System.out.print(sb);
   }
 }

// output : 55+8+1