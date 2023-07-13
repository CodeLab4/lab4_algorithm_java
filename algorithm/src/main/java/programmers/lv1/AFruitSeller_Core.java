package programmers.lv1;

import java.util.Arrays;

public class AFruitSeller_Core {
	public static void main(String[] args) {
		System.out.println(solution(4, 3, new int[] {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
	}

	public static int solution(int k, int m, int[] score) {
		Arrays.sort(score);

		int leastPoint = 0;
		int profit = 0;
		for (int i = 1; i <= score.length / m; i++) {
			leastPoint = score[(score.length - m * i)];
			profit += leastPoint * m;
		}

		return profit;
	}
}
