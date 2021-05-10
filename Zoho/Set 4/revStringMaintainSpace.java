//import java.util.Scanner;

public class revStringMaintainSpace {

    public static String[] split(String str, char ch)
    {

        String temp = "";
        String[] arr = new String[100];
        int index = 0;
        for(int i=0;i<str.length();i++)
        {
           if(str.charAt(i)!=ch)
           {
               temp += str.charAt(i);
           }
           else
           {
               arr[index++] = temp;
               temp = "";
           }
        }

       
        return  arr;
    }

    public static String reverseStr(String[] arr)
    {
        String str = "";
        for(String s : arr)
        {
            if(s!=null)
            str += reverse(s)+" ";
        }
        return str;
    }

    public static String reverse(String s)
    {
        String rev = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }

        return rev;
    } 

    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        String str = "This is a test String only";
        String[] sArr = split(str,' ');
        System.out.print(reverseStr(sArr));

       //sc.close();
    }
}
