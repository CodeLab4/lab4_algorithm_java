package programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CourierBox_roy {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {5, 4, 3, 2, 1}));
	}

	public static int solution(int[] order) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= order.length; i++) {
			queue.add(i);
		}

		int i = 0;

		while (true) {
			boolean flag = false;
			if (!queue.isEmpty() && order[i] == queue.peek()) {
				queue.poll();
				answer++;
				i++;
				flag = true;
				continue;
			}

			if (!stack.isEmpty() && order[i] == stack.peek()) {
				stack.pop();
				answer++;
				i++;
				flag = true;
				continue;
			}

			if (!queue.isEmpty()) {
				stack.add(queue.poll());
				flag = true;
			}

			if (!flag) {
				break;
			}
		}
		return answer;
	}
}
