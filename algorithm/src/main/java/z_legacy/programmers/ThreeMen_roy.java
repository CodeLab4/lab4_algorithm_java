package z_legacy.programmers;

import java.util.Arrays;

public class ThreeMen_roy {
	static int[] arr = new int[3];
	static int answer;

	public static void main(String[] args) {
		int[] number = {-3, -2, -1, 0, 1, 2, 3};
		answer = 0;
		recursion(number, 0, 0);
		System.out.println(answer);
	}

	public static void recursion(int[] number, int cnt, int idx) {
		if (cnt == 3) {
			if (Arrays.stream(arr).sum() == 0) {
				answer++;
			}
			return;
		}
		for (int i = idx; i < number.length; i++) {
			arr[cnt] = number[i];
			recursion(number, cnt + 1, i + 1);
		}
	}
}
