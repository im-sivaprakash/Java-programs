/*
 * OUTPUT
 *============================================
 Enter the Number of Disks 
 3
 Number of moves and steps 
 Move disk 1 from peg A --> to peg C
 Move disk 2 from peg A --> to peg B
 Move disk 1 from peg C --> to peg B
 Move disk 3 from peg A --> to peg C
 Move disk 1 from peg B --> to peg A
 Move disk 2 from peg B --> to peg C
 Move disk 1 from peg A --> to peg C
 *===============================================
 * 
 * 
 * */

import java.util.Scanner;

public class TowerOfHanio {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int num;
		 System.out.print("Enter the Number of Disks ");
		 num=sc.nextInt();
		 System.out.print("Number of moves and steps ");
		 toh(num,'A','C','B');
		 
	}
		 static void toh(int num,char from_peg,char to_peg,char aux_peg )
		 {
			 if(num==1) //Base condition
			 {
			  System.out.printf("\n Move disk 1 from peg %c --> to peg %c",from_peg,to_peg);
			  return;
			 } 
			
			 toh(num-1,from_peg,aux_peg,to_peg);
			 
		
			 System.out.printf("\n Move disk %d from peg %c --> to peg %c",num,from_peg,to_peg);
			 
			
			 toh(num-1,aux_peg,to_peg,from_peg);
		 }	 
}





