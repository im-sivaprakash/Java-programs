import java.util.*;

public class chocolateEaten
{  
  public static void main(String args[])
  {  
    int money = 50, price =1, wrappers =3, choco = 1, maxVisit = 0;
    int eaten = 0, wrapperInHand = 0;
    do{
        if(money>0) {
            eaten+=(money/price);
            wrapperInHand += eaten;
            money = 0;
        }
        if(wrapperInHand > wrappers) {
            int exchangedChoco = (wrapperInHand/wrappers) * choco;
            eaten+= exchangedChoco;
            wrapperInHand %= wrappers;
            wrapperInHand += exchangedChoco;
        }
        
    } while(--maxVisit!=0);
    System.out.println(eaten+" "+wrapperInHand);
  }
}
