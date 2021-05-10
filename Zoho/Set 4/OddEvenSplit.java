import java.util.Scanner;

// 2
// Hacker
// Rank
// Sample Output-
// Hce akr
// Rn ak

class OddEvenSplit
{
    public static String split(String s)
    {
        String odd = "";
        String even = "";
        for(int i=0;i<s.length();i++)
        {
           if(i%2==0)
           {
               even += s.charAt(i);
           }
           else 
           {
               odd += s.charAt(i);
           }


        }

         return even+" "+odd;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] sArr  = new String[n];

        for(int i=0;i<n;i++)
        {
            sArr[i] = sc.next();
        }

        for(String s : sArr)
        {
           System.out.println(split(s));
        }
 
        sc.close();
    }


}