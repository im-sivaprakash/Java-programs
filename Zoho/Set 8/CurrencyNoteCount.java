/* 
Input : 800
Output : Currency  Count 
         500 : 1
         200 : 1
         100 : 1
*/

class CurrencyNoteCount
{
    public static void  countNotes(int input ,int[] notes,int[] notesCount)
    {
        for(int i=0;i<notes.length;i++)
        {
            notesCount[i] = input / notes[i];
            input  = input - notesCount[i] * notes[i];
        }

        System.out.println("Currency Count");
        for(int j=0;j<notes.length;j++)
            if(notesCount[j]!=0)
            System.out.println(notes[j]+":"+notesCount[j]);  
    }


    public static void main(String args[])
    {
      int[] notes = {2000,500,200,100,50,20,10,5,1};
      int[] notesCount = new int[notes.length];

      int input = 800;
      countNotes(input,notes,notesCount);

    }
}