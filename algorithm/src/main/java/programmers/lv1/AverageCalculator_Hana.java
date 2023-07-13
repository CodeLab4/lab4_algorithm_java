package programmers.lv1;

import java.util.Arrays;

public class AverageCalculator_Hana {
	public static void main(String[] args) {
		//        int[] arr = {1,2,3,4};
		int[] arr = {5, 5};

		System.out.println(solution(arr));
	}

	public static double solution(int[] arr) {
		double answer = 0;

		answer = Arrays.stream(arr)
			.average()
			.orElse(0);

		return answer;
	}
}
