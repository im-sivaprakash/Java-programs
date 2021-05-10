public class chocolateEaten {
    public static void main(String args[])
    {
        int money = 40,price = 1,wrappers = 3,chocolate = 1;
      //  int maxVisit = 1;

        int chocolateEaten = money / price;
        int wrappersLeftInHand = money / (chocolate * wrappers);

        chocolateEaten += wrappersLeftInHand;
   
        System.out.print(
         "Total chocolate can eat "+chocolateEaten+'\n'+
         "Wrappers left in hand "+Math.abs(wrappersLeftInHand)

        );
        
    }
}
