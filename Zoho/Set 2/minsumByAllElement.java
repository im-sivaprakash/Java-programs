import java.util.*;

 // Compiler version JDK 11.0.2
 /*
Input : arr[] = { 2, 2, 3, 5, 6 } ; 
Output : 20
Explanation : We make the array as {2, 3, 4, 5, 6}. Sum becomes 2 + 3 + 4 + 5 + 6 = 20
*/
  
 class Dcoder
 {
   public static void main(String args[])
   { 
    int arr[] = { 3, 4, 6, 8 };
    int sum = 0;
    for(int i=0;i<arr.length;i++)
    {
      if(i==0)
      {
        sum+=arr[i];
      }
      else if(arr[i]==arr[i-1])
      {
        arr[i]++;
        sum+=arr[i];
      }
      else
      {
        sum+=arr[i];
      }
    }
    
   System.out.print(sum);
   }
 }
