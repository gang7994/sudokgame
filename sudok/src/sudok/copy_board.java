package sudok;

public class copy_board {
	public static String[][] copyboard(String [][] board) {//2���� �迭�� �����Ѵ�.
	     String [][] copy = new String[9][9];
	     for (int i = 0; i < 9 ;i++){
	        for (int j = 0; j < 9; j++) {
	           copy[i][j]=board[i][j];
	        }
	     }
	     return copy;
	  }
}
