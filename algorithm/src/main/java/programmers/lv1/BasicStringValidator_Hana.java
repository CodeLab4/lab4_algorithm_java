package programmers.lv1;

/**
 * 프로그래머스 Lv.1 문자열 다루기 기본
 */
public class BasicStringValidator_Hana {
	public static void main(String[] args) {
		//        String s = "a234";
		String s = "1234";

		System.out.println(solution(s));
	}

	public static boolean solution(String s) {
		boolean answer = true;

		if (!s.matches("^[0-9]{4}$|^[0-9]{6}$")) {
			return false;
		}

		return answer;
	}
}
