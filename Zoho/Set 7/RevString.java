class RevString {

    public static boolean isVowelAndSpace(char ch)
    {
        if(
          ch == 'a' ||
          ch == 'e' ||
          ch == 'i' ||
          ch == 'o' ||
          ch == 'u' ||
          ch == ' ' 
        )
        return true;
      
        return false;
    }

    public static void main(String[] args) {
      String str = "Hello Zoho , how is going?";
                //?going si woh , 

      int refArr[] = new int[str.length()];

      for(int i=0;i<str.length();i++)
      {
          if(isVowelAndSpace(str.charAt(i)))
          refArr[i]=str.charAt(i);
      }
     


      for(int j=str.length()-1;j>=0;j--)
      {
        
          System.out.print((refArr[j]==0) ? str.charAt(j) : (char)refArr[j]);
        
      }






    }
}
