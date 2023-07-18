package programmers.lv1;

public class Trio_Core {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {-2, 2, -1, 1, 1, 0, 2}));
	}

	public static int solution(int[] number) {
		int answer = 0;

		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				int tmp = number[i] + number[j];
				for (int z = j + 1; z < number.length; z++) {
					if (tmp + number[z] == 0) {
						answer++;
					}
				}
			}
		}

		return answer;
	}
}
