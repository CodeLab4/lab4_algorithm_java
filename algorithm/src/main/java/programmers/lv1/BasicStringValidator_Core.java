package programmers.lv1;

public class BasicStringValidator_Core {
	public static void main(String[] args) {
		System.out.println(solution("23a4"));
	}

	public static boolean solution(String s) {
		if (s.length() != 4 && s.length() != 6) {
			return false;
		}
		char[] chars = s.toCharArray();
		for (char c : chars) {
			if (Character.getNumericValue(c) == -1) {
				return false;
			}
		}
		return true;
	}
}
