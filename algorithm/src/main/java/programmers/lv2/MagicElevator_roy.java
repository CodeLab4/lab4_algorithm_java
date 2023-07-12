package programmers.lv2;

public class MagicElevator_roy {
	public static void main(String[] args) {
		System.out.println(solution(1234));
	}

	public static int solution(int storey) {
		int answer = 0;

		while(storey > 0) {
			int num = storey % 10;
			int nextNum = (storey / 10) % 10;

			if(num > 5) {
				storey += 10;
				answer += 10 - num;
			} else if(num == 5) {
				if(nextNum > 4) {
					storey += 10;
				}
				answer += 5;
			} else {
				answer += num;
			}
			storey /= 10;
		}

		return answer;
	}
}
