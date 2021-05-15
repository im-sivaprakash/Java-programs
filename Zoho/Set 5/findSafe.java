import java.util.*;

 // Compiler version JDK 11.0.2
/*
     There is a circular queue of processes. Every time there will be certain no of
     process skipped and a particular start position. Find the safe position.
     
     Input: Number of process:5
       Start position:3
       Skip: 2nd
Output: 1 will be the safest position
(Logic: 1 2 3 4 5 starting from 3, 5th process will be skipped
        1 2 3 4 5 process 2 will be skipped
        1 2 3 4 5 process 4 will be skipped
        1 2 3 4 5 process 3 will be skipped, so safest process is 1.
     
*/
 class Dcoder
 {
   public static void main(String args[])
   { 
    int total = 5;
    int start = 3;
    int skip  = 2;
    int times = total-1;
    int arr[] = new int[total];
    for(int i=1;i<total;i++)
    {
      arr[i-1]=i;
    }
    
    while(times-- > 0)
    {
      while(start++ < total)
      {
        if(start < total)
        arr[(start-2)+skip] = 0;
        
      }
      start = 0;
    }
    
    for(int i=0;i<total;i++)
    {
      
      
      if(arr[i]!=0)
      {
        System.out.print(arr[i]);
      }
      
      
    }
    
   }
 }
