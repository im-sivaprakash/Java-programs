import java.util.Scanner;
public class Pal
{
    
    public static String palindrom(String str,int start,int n,String temp)
    {
        if(n==0)
        {
          return temp;  
        }
        return palindrom(str,start+1,n-1, str.charAt(start)+temp);
    }
    
    
	public static void main(String[] args) 
	{
        // 	Scanner sc = new Scanner(System.in);
        // 	String str = sc.nextLine();
        
        String str = "amma";
        String temp = "";
        System.out.println((str.equals(palindrom(str,0,str.length(),temp))) ? "Yes" : "No");
	}
}
