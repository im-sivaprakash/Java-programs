import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    int arr[] = {1,2,3};
    int leftSum = 0,rightSum = 0,output=-1;
    
    for(int i=0; i<arr.length; i++)
    {
      
      for(int j=0 ;j<i; j++)
      {
        leftSum+=arr[j];
      }
      
      
      for(int k=arr.length-1;k>i;k--)
      {
        rightSum+=arr[k];
      }
      
      if(rightSum == leftSum){
        output = i;
        break;
      }
       else 
       {
         rightSum=0;leftSum=0;
       }
    }
    
    System.out.print(output);
    
    
   }
 }
