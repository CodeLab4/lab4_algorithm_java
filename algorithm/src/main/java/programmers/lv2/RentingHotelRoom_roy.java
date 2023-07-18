package programmers.lv2;

import java.util.Arrays;

public class RentingHotelRoom_roy {
	public static void main(String[] args) {
		String[][] book_time = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"},
			{"18:20", "21:20"}};
		solution(book_time);
	}

	public static int solution(String[][] book_time) {
		int answer = 0;
		int[] arr = new int[1450];

		for (int i = 0; i < book_time.length; i++) {
			int[] startTemp = Arrays.stream(book_time[i][0].split(":"))
				.mapToInt(Integer::parseInt)
				.toArray();
			int startTime = startTemp[0] * 60 + startTemp[1];

			int[] endTemp = Arrays.stream(book_time[i][1].split(":"))
				.mapToInt(Integer::parseInt)
				.toArray();
			int endTime = endTemp[0] * 60 + endTemp[1] + 10;

			arr[startTime] += 1;
			arr[endTime] += -1;
		}

		for (int i = 1; i < arr.length; i++) {
			arr[i] += arr[i - 1];
			answer = Math.max(answer, arr[i]);
		}

		return answer;
	}
}
