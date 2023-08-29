package programmers.lv2;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
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
		Map<LocalTime, String> workFlow = new HashMap<>();
		Map<String, LocalTime> workTime = new HashMap<>();
		List<String> answerList = new ArrayList<>();
		PriorityQueue<LocalTime> queue = new PriorityQueue<>();
		PriorityQueue<LocalTime> restQueue = new PriorityQueue<>();

		for (String[] s : plans) {
			LocalTime instance = LocalTime.parse(s[1]);
			workFlow.put(instance, s[0]);
			workTime.put(s[0], LocalTime.ofSecondOfDay(Integer.parseInt(s[2]) * 60L));
			queue.add(instance);
		}

		// 1. 숙제를 시간순으로 정렬
		// 2. 현재 숙제에 시간을 더한값과 다음 숙제의 시간을 비교
		// 3. 작으면 레디큐에서 뺴서 진행 후 다시 비교 같으면 그냥 진행
		// 4. 많으면 차이만큼 맵에 저장하고 남은 시간 레디큐에 넣기

		while (!queue.isEmpty()) {
			LocalTime nowWork = queue.poll();
			String subject = workFlow.get(nowWork);
			LocalTime restTime = workTime.get(subject);
			if (queue.size() > 1) {
				LocalTime nextWork = queue.peek();
				LocalTime difTime = LocalTime.ofSecondOfDay(
					nextWork.toSecondOfDay() - nowWork.toSecondOfDay() + restTime.toSecondOfDay());
				if (difTime.toSecondOfDay() < 0) {
					restQueue.add(difTime);
					workTime.replace(subject, difTime);
				} else if (difTime.toSecondOfDay() == 0){
					answerList.add(subject);
				} else {
					if(!restQueue.isEmpty()) {
						restQueue.poll();
					}
					workTime.replace(subject, LocalTime.of(0,0));
					answerList.add(subject);
				}
			}
		}
		System.out.println(queue);
		System.out.println(restQueue);
		System.out.println(workFlow);
		System.out.println(workTime);
		System.out.println(answerList);
		return new String[] {"s"};
	}
}
