package programmers.lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class Homework_roy {

	public static void main(String[] args) {
		String[][] plans = {{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"},
			{"computer", "12:30", "100"}};
		System.out.println(Arrays.toString(solution(plans)));
	}

	public static String[] solution(String[][] plans) {
		PriorityQueue<String[]> tasks = new PriorityQueue<>(Comparator.comparing(o -> o[1]));
		Stack<String[]> paused = new Stack<>();
		List<String> completed = new ArrayList<>();

		tasks.addAll(Arrays.asList(plans));

		long currentTime = 0;
		while (!tasks.isEmpty() || !paused.isEmpty()) {
			while (!tasks.isEmpty() && timeToMinutes(tasks.peek()[1]) <= currentTime) {
				paused.push(tasks.poll());
			}

			String[] currentTask;
			if (paused.isEmpty()) {
				currentTask = tasks.poll();
				currentTime = timeToMinutes(currentTask[1]);
			} else {
				currentTask = paused.pop();
			}

			long endTimeForCurrentTask = currentTime + Long.parseLong(currentTask[2]);
			currentTime = endTimeForCurrentTask;

			if (tasks.isEmpty() || timeToMinutes(tasks.peek()[1]) >= endTimeForCurrentTask) {
				completed.add(currentTask[0]);
			} else {
				currentTask[2] = String.valueOf(endTimeForCurrentTask - timeToMinutes(tasks.peek()[1]));
				paused.push(currentTask);
			}
		}

		return completed.toArray(new String[0]);
	}

	private static long timeToMinutes(String time) {
		String[] parts = time.split(":");
		return Long.parseLong(parts[0]) * 60 + Long.parseLong(parts[1]);
	}
}
