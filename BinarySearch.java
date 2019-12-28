public class BinarySearch{
    public static void main(String args[])
    {
      int arr[] = {2,5,6,8,9,11,17,34,36,89,102,45};
       
       int len = arr.length-1;

      int  searchVal = 8;
      int  start = 0;

      int val = Search(arr,start,len,searchVal);

          if(val==-1) System.out.print("Element found"); else System.out.print("Element found at "+val);

    }

    public static int Search(int arr[],int start,int len,int searchVal)
    {
       while(start<=len)

       {    
          int mid = start + (len+1)/2; 
          
           if(arr[mid]==searchVal)
           {
               return mid;
           }
           if(arr[mid]<searchVal)
           {
             start = mid + 1;
           }
           else
           {
                len = mid - 1;
               
           }
       }

       return -1;

    }
    
}