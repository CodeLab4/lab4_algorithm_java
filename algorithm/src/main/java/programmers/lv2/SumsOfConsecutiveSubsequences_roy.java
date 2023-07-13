package programmers.lv2;

import java.util.HashSet;
import java.util.Set;

public class SumsOfConsecutiveSubsequences_roy {
	public int solution(int[] elements) {
		int answer = 0;
		int size = 1;

		Set<Integer> set = new HashSet<>();
		int idx = 0;

		while (size <= elements.length) {
			int sum = 0;

			for (int i = 0; i < size; i++) {
				sum += elements[i % elements.length];
				set.add(sum);
			}

			for (int i = 0; i < elements.length; i++) {
				sum -= elements[i % elements.length];
				sum += elements[(i + size) % elements.length];
				set.add(sum);
			}
			size++;
		}
		answer = set.size();
		return answer;
	}
}
