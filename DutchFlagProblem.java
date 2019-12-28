class DutchflagProblem{
    public static void main(String args[])
    {
       int[] arr = {0,2,1,0,0,1,2,1,2,1}; // output : 0001111222
       int low = 0,high = 9, mid = 0;
    
     while(mid<=high)
    {
      switch(arr[mid])
      { 
          case 0:{
            int temp = arr[low];
           arr[low] = arr[mid];
           arr[mid] = temp;
            low++;

            mid++;
            break;
          }
          

          case 1:
          mid++;
          break;

          case 2:
          {
           int temp = arr[mid];
           arr[mid] = arr[high];
           arr[high] = temp;
           high--;
            break;
          }
        

      }
    }
    for(int j=0;j<arr.length;j++)
    {
        System.out.print(arr[j]);
    }


    }


}