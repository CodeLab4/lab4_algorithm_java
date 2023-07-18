package programmers.lv1;

public class EvenAndOdd_Hana {
	public static void main(String[] args) {
		int num = 3;
		//        int num = 4;

		System.out.println(solution(num));
	}

	public static String solution(int num) {
		String answer = "";

		if (num % 2 == 0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}

		return answer;
	}
}
