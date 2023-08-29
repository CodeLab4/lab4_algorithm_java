package programmers.lv2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Homework_roy {

	public static void main(String[] args) {
		String[][] plans = {{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"},
			{"computer", "12:30", "100"}};
		System.out.println(Arrays.toString(solution(plans)));
	}

	public static String[] solution(String[][] plans) {
		Map<Long, String> workFlow = new HashMap<>();
		Map<String, Long> workTime = new HashMap<>();
		List<String> answerList = new ArrayList<>();
		PriorityQueue<Long> queue = new PriorityQueue<>();
		Deque<Long> restQueue = new ArrayDeque<>();

		for (String[] s : plans) {
			long[] timeSplit = Arrays.stream(s[1].split(":")).mapToLong(Long::parseLong).toArray();
			long minute = timeSplit[0] * 60 + timeSplit[1];
			workFlow.put(minute, s[0]);
			workTime.put(s[0], Long.parseLong(s[2]));
			queue.add(minute);
		}

		long currentTime = 0;
		while (!queue.isEmpty() || !restQueue.isEmpty()) {
			while (!queue.isEmpty() && queue.peek() <= currentTime) {
				restQueue.push(queue.poll());
			}

			if (restQueue.isEmpty()) {
				currentTime = queue.peek();
				continue;
			}

			String currentTask = workFlow.get(restQueue.peek());
			long remainingTime = workTime.get(currentTask);

			if (!queue.isEmpty() && currentTime + remainingTime > queue.peek()) {
				long timeElapsed = queue.peek() - currentTime;
				workTime.put(currentTask, remainingTime - timeElapsed);
				currentTime = queue.peek();
			} else {
				restQueue.pop();
				answerList.add(currentTask);
				currentTime += remainingTime;
			}
		}

		return answerList.toArray(new String[0]);
	}
}
