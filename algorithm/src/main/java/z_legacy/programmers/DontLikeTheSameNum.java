package z_legacy.programmers;

import java.util.Arrays;
import java.util.Stack;

public class DontLikeTheSameNum {
	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};

		Stack<Integer> numHolder = new Stack<>();

		numHolder.push(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (numHolder.peek() != arr[i]) {
				numHolder.push(arr[i]);
			}
		}

		int[] answer = new int[numHolder.size()];
		for (int i = 0; i < numHolder.size(); i++) {
			answer[i] = numHolder.get(i);
		}

		System.out.println(Arrays.toString(answer));
	}
}
