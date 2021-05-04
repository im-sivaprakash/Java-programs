import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    int arr[] = {5,4,6,5,3,8,2,6,2,4,2};
    
    Arrays.sort(arr);
    
    int count = 1;
    int perv = arr[0];
    
    for(int i=1;i<arr.length;i++)
    {
      if(perv==arr[i])
      {
        count++;
      }
      else
      {
        if(count!=1)
        System.out.println(perv+"==>"+count);
        perv = arr[i];
        count = 1;
      }
    }
    
   }
 }
