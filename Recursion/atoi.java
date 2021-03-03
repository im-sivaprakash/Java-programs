import java.util.Scanner;
public class Atoi
{
    public static int atoi(String num,int n)
    {
        if(n==1)
        {
            return num.charAt(0) - '0';
        }
        System.out.println(n);
        return (10 * atoi(num,n-1) + num.charAt(n-1) - '0');
    }
    
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   String num = sc.nextLine();
	   System.out.print(atoi(num,num.length()));
	}
}
