package sudok;

public class find {
	public static boolean find_int(int [] set, int k) {//둘 다집합에 특정한 값이 있으먄 true를 리턴한다.
		boolean bool = false;
		for (int i = 0; i < set.length; i++) {
			if (set[i] == k) {
				bool = true;
			}
		}
		return bool;
	}
	
}
