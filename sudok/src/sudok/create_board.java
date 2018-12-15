package sudok;

public class create_board {//특정한 순서를 가지는 2차원 배열을 만든다.
	static sudok.shuffle a = new sudok.shuffle();
    static String[] seed = {"1","2","3","4","5","6","7","8","9"};
    static String[] result = a.shuffle_number(seed);
	public static String[][] createboard() {
		 String n1 = result[0];
	     String n2 = result[1];
	     String n3 = result[2];
	     String n4 = result[3];
	     String n5 = result[4];
	     String n6 = result[5];
	     String n7 = result[6];
	     String n8 = result[7];
	     String n9 = result[8];
	     String[][] board2 = {{n1,n2,n3,n4,n5,n6,n7,n8,n9},
	                      {n4,n5,n6,n7,n8,n9,n1,n2,n3},
	                      {n7,n8,n9,n1,n2,n3,n4,n5,n6},
	                      {n2,n3,n1,n5,n6,n4,n8,n9,n7},
	                      {n5,n6,n4,n8,n9,n7,n2,n3,n1},
	                      {n8,n9,n7,n2,n3,n1,n5,n6,n4},
	                      {n3,n1,n2,n6,n4,n5,n9,n7,n8},
	                      {n6,n4,n5,n9,n7,n8,n3,n1,n2},
	                      {n9,n7,n8,n3,n1,n2,n6,n4,n5}};
	     return board2;
	  }
}
