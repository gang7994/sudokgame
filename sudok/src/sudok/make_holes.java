package sudok;

public class make_holes {//2차원 배열에 no_of_holes 만큼 구멍을 뚫는다.
	public static String[][] makeholes(String[][] board, int no_of_holes)
	{
		int n = no_of_holes;
		int r = no_of_holes/9;
		while (n>0) {
			for (int i = 0; i < 9; i++) {
				int count = r;
				while (count > 0) {
					int j = (int)(Math.random()*9);
					if (board[i][j] == "")
						continue;
					else {
						board[i][j] = "";
						count-=1;
						n-=1;
					}
				}
			}
		}
		return board;
	}
	
}
