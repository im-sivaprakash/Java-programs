
import java.util.Scanner;

public class EuclideAlgorithm{
    
    public static int gcd(int a,int b)
    {
        if(a == 0)
            return b;


        return gcd(b%a,a);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = 0 ,b = 0;
        System.out.println("Enter A value ");
        a = sc.nextInt();
        System.out.println("Enter B value ");
        b = sc.nextInt();

        int res = gcd(a,b);
        System.out.println("The gcd is "+res);
    }
}
