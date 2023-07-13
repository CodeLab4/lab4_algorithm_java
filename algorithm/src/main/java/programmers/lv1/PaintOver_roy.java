package programmers.lv1;

public class PaintOver_roy {
	public int solution(int n, int m, int[] section) {
		int answer = 0;
		int maxIdx = 0;

		for (int i : section) {
			if (maxIdx <= i) {
				maxIdx = i + m;
				answer++;
			}
		}

		return answer;
	}
}
