import java.util.*;

//Compiler version JDK 11.0.2
/*
Input : 
str1 = "heap", str2 = "pea" 
Output : 
Minimum Deletion = 2 and
Minimum Insertion = 1
Explanation:
p and h deleted from heap
Then, p is inserted at the beginning
One thing to note, though p was required yet
it was removed/deleted first from its position and
then it is inserted to some other position.
Thus, p contributes one to the deletion_count
and one to the insertion_count.
*/
class Dcoder
{  
  public static void main(String args[])
  {  
    String str1 = "heap", str2="pea";
    int max = 0,i=0,j=0;
    int m=str1.length(),n=str2.length();
    
    int[][] mat = new int[m+1][n+1];
    
    for(i=0;i<=m;i++)
    {
        for(j=0;j<=n;j++)
        {
            if(i==0 || j==0)
              mat[i][j] = 0;
            else if(str1.charAt(i-1)==str2.charAt(j-1))
                mat[i][j]=mat[i-1][j-1] + 1;
            else
                mat[i][j] = Math.max(mat[i-1][j],mat[i][j-1]);      
        }
    }
      
    max = mat[m][n];
    
  System.out.println("Minimum Deletion = "+(m-max));
  System.out.println("Minimum Insertion = "+(n-max));
    
    
        
  }
}