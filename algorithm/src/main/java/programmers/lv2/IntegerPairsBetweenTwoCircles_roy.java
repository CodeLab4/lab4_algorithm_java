package programmers.lv2;

public class IntegerPairsBetweenTwoCircles_roy {
	public long solution(int r1, int r2) {
		long answer = 0;
		long dif = (r2 - r1) * 4L;
		for (int x = 1; x < r2; x++) {
			double outer = Math.sqrt(Math.pow(r2, 2) - Math.pow(x, 2));
			double inner = Math.sqrt(Math.pow(r1, 2) - Math.pow(x, 2));
			long cnt = (long)outer - (long)inner;
			if (inner == (long)inner) {
				cnt++;
			}
			answer += cnt * 4;
		}
		return answer + dif;
	}
}
