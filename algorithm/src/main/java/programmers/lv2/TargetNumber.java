package programmers.lv2;

class TargetNumber {
	static int answer = 0;

	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		solution(numbers,3);
	}

	public static int solution(int[] numbers, int target) {

		recursion(0, numbers, target, 0);

		return answer;
	}

	public static void recursion(int idx, int[] numbers, int target, int current) {
		if (idx == numbers.length) {
			if (current == target) {
				answer++;
			}
			return;
		}

		recursion(idx + 1, numbers, target, current + numbers[idx]);
		recursion(idx + 1, numbers, target, current - numbers[idx]);
	}
}
