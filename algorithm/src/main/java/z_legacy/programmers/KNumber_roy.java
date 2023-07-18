package z_legacy.programmers;

import java.util.Arrays;

public class KNumber_roy {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			answer[i] = Arrays.stream(array, commands[i][0] - 1, commands[i][1])
				.sorted()
				.skip(commands[i][2] - 1)
				.findFirst()
				.getAsInt();
		}
		System.out.println(Arrays.toString(answer));
	}
}
