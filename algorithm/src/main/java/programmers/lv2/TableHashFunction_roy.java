package programmers.lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableHashFunction_roy {
	public static void main(String[] args) {
		int[][] data = {{2, 2, 6}, {1, 5, 10}, {4, 2, 9}, {3, 8, 3}};
		System.out.println(solution(data, 2, 2, 3));
	}

	public static int solution(int[][] data, int col, int row_begin, int row_end) {
		int answer = 0;

		Arrays.sort(data, (o1, o2) -> {
			if(o1[col - 1] != o2[col - 1]) {
				return o1[col - 1] - o2[col - 1];
			} else {
				return o2[0] - o1[0];
			}
		});

		List<Integer> list = new ArrayList<>();
		for (int i = row_begin - 1; i <= row_end - 1; i++) {
			int temp = 0;
			for (int j = 0; j < data[i].length; j++) {
				temp += data[i][j] % (i + 1);
			}
			list.add(temp);
		}

		for (int i : list) {
			answer ^= i;
		}

		return answer;
	}
}
