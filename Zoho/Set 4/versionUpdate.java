import java.util.Scanner;

public class versionUpdate {

    public static int[] split(String s,int n,char ch)
    {
       int[] arr = new int[n];
       int index = 0;
       for(int i=0;i<n;i++)
       {
           if(s.charAt(i)!=ch)
           {
              arr[index++] = Integer.valueOf(s.charAt(i));
           }
       }

       return arr;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Version 1 ");
        String v1 = sc.next();
        System.out.print("Version 2 ");
        String v2 = sc.next();
        String status = "";

        int[] v1Arr = split(v1,v1.length(),'.');
        int[] v2Arr = split(v2,v2.length(),'.');


        for(int i=0;i<v1Arr.length;i++)
        {
        
             if(v1Arr[i]<v2Arr[i])
             {
                status = "upgraded";
                break;
             } 
             else
             {
                status =  "downgraded";
             }
           
        }

        System.out.println(status);
        sc.close();
    }
}
