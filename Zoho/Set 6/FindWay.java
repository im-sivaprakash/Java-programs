public class FindWay
{  

  public static boolean isPathAvailable(int[][] arr,int i,int j) {
    if(i==arr.length-1 && j==arr.length-1 && arr[i][j]==1) return true;
    
    if(i>arr.length-1 || j>arr.length-1 || arr[i][j] != 1) return false;
    
    return isPathAvailable(arr,i+1,j) || isPathAvailable(arr,i,j+1);
  }

  public static void main(String args[])
  { 
    int[][] arr= {
        {1,0,1,0,0},
        {1,1,1,1,1},
        {0,0,0,1,0},
        {1,0,1,1,1},
        {0,1,1,0,1}
    };
    System.out.println(isPathAvailable(arr,0,0));
  }
  
}
