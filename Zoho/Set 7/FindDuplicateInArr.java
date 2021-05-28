import java.util.*;


class FindDuplicateInArr
{
    public static void main(String[] args) {
        int[] arr = {1,4,2,1,21,1,2,3,0,4,1,3};
  
        Set<Integer> a = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
          int count = 0;
          for(int j=0;j<arr.length;j++)
          {
              if(arr[i]==arr[j])
              {
                 count++;
              }
          }
          if(count>1)
          {
            a.add(arr[i]);
          }
        }

        System.out.println(a);
    }
}