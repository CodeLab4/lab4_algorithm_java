package programmers.lv2;

import java.util.ArrayList;
import java.util.List;

public class HailSequenceDefiniteIntegral_roy {
	public double[] solution(int k, int[][] ranges) {
		double[] answer = new double[ranges.length];

		// 콜라스 추측 리스트
		List<Integer> list = new ArrayList<>();
		list.add(k);

		// 콜라스 추측 나머지 구하기
		while(k > 1) {
			if(k % 2 == 0) {
				k /= 2;
			} else {
				k = k * 3 + 1;
			}
			list.add(k);
		}

		// 정적분 범위 구하기
		for(int i = 0; i < ranges.length; i++) {
			int start = ranges[i][0];
			int end = list.size() - 1 + ranges[i][1];

			// 시작 범위가 끝 범위 보다 크다면
			if(start > end) {
				answer[i] = -1;
				continue;
			}

			// 시작 범위부터 x를 1씩 증가시키며 사다리꼴 넒이 구하기
			double sum = 0;
			for(int j = start; j < end; j++) {
				double now = list.get(j);
				double target = list.get(j + 1);
				sum += (now + target) / 2;
			}
			answer[i] = sum;
		}
		return answer;
	}
}
