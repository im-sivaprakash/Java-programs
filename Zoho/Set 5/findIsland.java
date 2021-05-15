import java.util.*;

 // Compiler version JDK 11.0.2
/*
    1 represents ocean and 1 represents land find the number of islands in the given matrix.
     1 -1 -1  1
      -1  1 -1  1
      -1 -1  1 -1
      -1 -1 -1  1
Output: 2 (two islands at 1, 1 and 2, 2)
*/
 class Dcoder
 {
   public static void main(String args[])
   { 
    int arr[][] = {
                {1,-1,-1,1},
                {-1,1,-1,1},
                {-1,-1,1,-1},
                {-1,-1,-1,1}
              };
    int n = arr[0].length;
    int m = arr.length;
    int count = 0;
       
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        if
        (
          i > 0 &&
          j > 0 &&
          i < m-1 &&
          j < n-1 &&
          arr[i-1][j] == -1 &&
          arr[i+1][j] == -1 &&
          arr[i][j-1] == -1 &&
          arr[i][j+1] == -1 &&
          arr[i][j] == 1
        )
        {
          count++;
        }
        
      }
      
    }       
    System.out.print(count);
   }
 }
