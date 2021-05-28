class IntToBinaryRE
{

    public static  String intToBi(int n,String bi)
    {
        if(n==1)
        return bi+"1";
        else 
        {
            bi+=(n%2)+"";
           return intToBi(n/2,bi);
        }
    }

    public static void main(String[] args) {
        int num =  12;
        String bi = "";
        StringBuilder s = new StringBuilder(intToBi(num,bi));

        System.out.println(s.reverse());
    }
}