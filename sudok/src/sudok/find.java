package sudok;

public class find {
	public static boolean find_int(int [] set, int k) {//�� �����տ� Ư���� ���� ������ true�� �����Ѵ�.
		boolean bool = false;
		for (int i = 0; i < set.length; i++) {
			if (set[i] == k) {
				bool = true;
			}
		}
		return bool;
	}
	
}
