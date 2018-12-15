package sudok;

public class make_holeset {
	public static int [] get_holeset(String[][] board,int no_of_holes) {
		int[] holeset = new int[no_of_holes];
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == "") {
					holeset[count] = 9*i+j;
					count+=1;
				}
			}
		}
		return holeset;
	}
}
