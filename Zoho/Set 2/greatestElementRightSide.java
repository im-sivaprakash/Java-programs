import java.util.*;

 // Compiler version JDK 11.0.2
/*
  Given an array of integers, replace every element with the next greatest element 
  (greatest element on the right side) in the array. Since there is no element next to the last element, replace it with -1. For example, if the array is {16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5, 5, 2, -1}. 
  */
 class Dcoder
 {
   public static void main(String args[])
   { 
    int[] arr = {16, 17, 4, 3, 5, 2};
    for(int i=0;i<arr.length;i++)
    {
      int max = 0;
      if(i+1==arr.length)
      {
        max = -1;
      }
      else
      {
        for(int j=i+1;j<arr.length;j++)
        {
          if(max<arr[j])
          {
            max = arr[j];
          }
        }
      }
     
      arr[i] = max;
    }
    
    for(int i=0;i<arr.length;i++)
     System.out.print(arr[i]);
     
   }
 }
