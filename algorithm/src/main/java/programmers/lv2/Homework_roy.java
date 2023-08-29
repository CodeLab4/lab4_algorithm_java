package programmers.lv2;

import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework_roy {
	public static void main(String[] args) {
		String[][] plans = {{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"},
			{"computer", "12:30", "100"}};
		System.out.println(Arrays.toString(solution(plans)));
	}

	public static String[] solution(String[][] plans) {
		String[] answer = new String[plans.length];
		Map<String, LocalTime> workMap = new HashMap<>();
		Map<String, Integer> workTime = new HashMap<>();
		List<Integer> answerList = new ArrayList<>();

		for (String[] s : plans) {
			int[] timeTemp = Arrays.stream(s[1].split(":")).mapToInt(Integer::parseInt).toArray();
			workMap.put(s[0], LocalTime.of(timeTemp[0], timeTemp[1]));
			workTime.put(s[0], Integer.parseInt(s[2]));
		}

		List<String> list = new ArrayList<>(workMap.keySet());
		list.sort(Comparator.comparing(workMap::get));

		Deque<String> deque = new ArrayDeque<>(list);

		while (!deque.isEmpty()) {
			String temp = deque.poll();
			LocalTime plusTime = workMap.get(temp).plusMinutes(workTime.get(temp));
			LocalTime nextWorkTime = workMap.get(deque.peek());
			if (plusTime.isAfter(nextWorkTime)) {
				LocalTime m = LocalTime.ofSecondOfDay(plusTime.toSecondOfDay() - nextWorkTime.toSecondOfDay());
			}
		}

		return answer;
	}
}
