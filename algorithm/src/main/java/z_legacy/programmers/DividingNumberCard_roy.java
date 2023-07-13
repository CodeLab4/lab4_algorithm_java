package z_legacy.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DividingNumberCard_roy {
	public static void main(String[] args) {
		int[] arrayA = {10, 20};
		int[] arrayB = {5, 17, 20};

		int resultA = calculate(arrayA, arrayB);
		int resultB = calculate(arrayB, arrayA);

		int answer = Math.max(resultA, resultB);

		System.out.println(answer);
	}

	public static int calculate(int[] arrayA, int[] arrayB) {
		List<Integer> list = new ArrayList<>();
		int min = Arrays.stream(arrayA).min().getAsInt();

		for (int i = 1; i <= min; i++) {
			if (min % i == 0) {
				list.add(i);
			}
		}

		list.sort(Collections.reverseOrder());

		boolean flag = false;
		int gcd = 0;

		for (int i : list) {
			for (int j = 0; j < arrayA.length; j++) {
				if (arrayA[j] % i != 0) {
					break;
				}
				if (j == arrayA.length - 1) {
					flag = true;
					break;
				}
			}
			if (flag) {
				gcd = i;
				break;
			}
		}

		int result = 0;
		for (int j : arrayB) {
			if (j % gcd == 0) {
				result = 0;
				break;
			} else {
				result = gcd;
			}
		}

		return result;
	}
}
