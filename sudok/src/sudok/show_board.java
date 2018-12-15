package sudok;

public class show_board {
	public static void showboard(String[][] copy_board) {
	      
	      System.out.println("S | 1 2 3 4 5 6 7 8 9");
	      System.out.println("- + - - - - - - - - -");
	      int l =1;
	      for (int i= 0; i<9;i++) {  
	          for (int j =0;j<9; j++) {             
	          }
	          System.out.println(l+" "+'|'+" "+copy_board[i][0]+" "+copy_board[i][1]+" "+copy_board[i][2]+" "+
	                copy_board[i][3]+" "+copy_board[i][4]+" "+copy_board[i][5]+" "+copy_board[i][6]+" "+copy_board[i][7]+" "+copy_board[i][8]);
	          l +=1; 
	          
	      }
	  }
}
