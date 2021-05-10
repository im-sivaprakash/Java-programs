import java.util.Arrays;

public class alternateSorting {
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        //7 1 6 2 5 3 4 
        Arrays.sort(arr);
        int end = arr.length-1;
        int start = 0;
        for(int i=0;i<arr.length;i++)
        {
           if(i%2==0)
            System.out.print(arr[end--]+" ");
           else
            System.out.print(arr[start++]+" ");
        }
    }
}
