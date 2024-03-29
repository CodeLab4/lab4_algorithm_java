package z_legacy.programmers;

import java.util.Stack;

public class Hamburger_roy {
	public static void main(String[] args) {
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		//        int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};
		int answer = 0;

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < ingredient.length; i++) {
			stack.push(ingredient[i]);
			if (stack.size() >= 4) {
				if (stack.get(stack.size() - 4) == 1
					&& stack.get(stack.size() - 3) == 2
					&& stack.get(stack.size() - 2) == 3
					&& stack.get(stack.size() - 1) == 1) {
					stack.pop();
					stack.pop();
					stack.pop();
					stack.pop();
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
