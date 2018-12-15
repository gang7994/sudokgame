package sudok;

import javax.swing.*;


public class buttoncheck {//버튼집합이 전부 수로 채워지면 true를 리턴한다.
	public static boolean all_check(JButton[] buttonset) {
		boolean bool = true;
		for (int i = 0; i < 81; i++) {
			if (buttonset[i].getText() == "")
				bool = false;
		}
		return bool;
	}
}
