package programmers.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImprovisedKeyboard_roy {
	public int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];

		for (int i = 0; i < targets.length; i++) {
			boolean flag = false;
			String[] targetSplit = targets[i].split("");
			int sum = 0;
			for (int j = 0; j < targetSplit.length; j++) {
				int result = search(keymap, targetSplit[j]);
				if (result == -1) {
					answer[i] = -1;
					flag = true;
					break;
				}
				sum += result;
			}
			if (!flag) {
				answer[i] = sum;
			}
		}
		return answer;
	}

	public int search(String[] keymap, String target) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < keymap.length; i++) {
			String[] keymapSplit = keymap[i].split("");
			for (int j = 0; j < keymapSplit.length; j++) {
				if (keymapSplit[j].equals(target)) {
					list.add(j + 1);
					break;
				}
			}
		}
		if (list.isEmpty()) {
			return -1;
		}
		return Collections.min(list);
	}
}
