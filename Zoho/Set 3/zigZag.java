import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
     int mat[][] ={{1, 2, 3},
                   {4, 5, 6}, 
                   {7, 8, 9}};
     int n = mat.length,m=mat[0].length;
      int col =0,row =0;
      boolean up = true;
      while(col<n && row<m)
      {
        if(up)
        {
          while(col<n-1 && row>0)
          {
            System.out.print(mat[row][col]);
            row--;
            col++;
          }
          
          System.out.print(mat[row][col]);
          
          if(col==n-1)
           row++;
          else
           col++;
          
        }
        else
        {
          while(col>0 && row<m-1)
          {
            System.out.print(mat[row][col]);
            row++;
            col--;
          }
          System.out.print(mat[row][col]);
          
          if(row==m-1)
           col++;
          else
           row++;
        }
        up=!up;
      }            
     
   }
 }
