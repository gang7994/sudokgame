package sudok;

import javax.swing.*;


public class buttoncheck {//��ư������ ���� ���� ä������ true�� �����Ѵ�.
	public static boolean all_check(JButton[] buttonset) {
		boolean bool = true;
		for (int i = 0; i < 81; i++) {
			if (buttonset[i].getText() == "")
				bool = false;
		}
		return bool;
	}
}
