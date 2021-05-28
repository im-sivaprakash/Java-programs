public class LatinMatrix {
    public static void main(String[] args) {
        int ch  = 65;
        int ch2 = 65;

        int n = 3;

        for(int index=0;index<n;index++)
        {
            for(int index1=index;index1<n;index1++)
            System.out.print((char)ch++);

            for(int index2=0;index2<index;index2++)
            System.out.print((char)ch2++);

            System.out.println();
            ch = 65+index+1;
            ch2 = 65+index;
        }
        
    }
}
