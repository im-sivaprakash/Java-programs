public class ArrangeElementsInArray {
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,7,9,3,5,8};
        //output   :    9 1 8 2 7 3 6 4 5

        for(int index=0;index<arr.length;index++)
        {
            // Bubble sort 
            // for(int index2=0;index2<arr.length-index-1;index2++)
            // {
            //   if(arr[index2]<arr[index2+1])
            //   {
            //       int temp = arr[index2];
            //       arr[index2] = arr[index2+1];
            //       arr[index2+1] = temp;
            //   }
            // }

            //Insertion sort
            for(int index2=index+1;index2<arr.length;index2++)
            {
              if(arr[index]<arr[index2])
              {
                  int temp = arr[index];
                  arr[index] = arr[index2];
                  arr[index2] = temp;
              }
            }


            index++;

            for(int index2=index+1;index2<arr.length;index2++)
            {
              if(arr[index]>arr[index2])
              {
                  int temp = arr[index];
                  arr[index] = arr[index2];
                  arr[index2] = temp;
              }
            }

        }
          

          for(int index = 0 ;index<arr.length;index++)
           System.out.print(arr[index]+" ");

        
    }
}
