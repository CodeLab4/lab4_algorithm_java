package programmers.lv2;

public class Dotted_roy {
	public long solution(int k, int d) {
		// (0,0) 추가
		long answer = 1;

		// x, y가 0일 경우 나올수 있는 점의 개수
		answer += (d / k) * 2L;

		// x, y가 0이 아닐경우 나올수 있는 점의 개수
		for (int i = 1; i * k <= d; i++) {
			int n = i * k;
			answer += (int)Math.sqrt(Math.pow(d, 2) - Math.pow(n, 2)) / k;
		}

		return answer;
	}
}
