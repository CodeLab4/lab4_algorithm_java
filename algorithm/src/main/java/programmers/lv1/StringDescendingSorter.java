package programmers.lv1;

import java.util.Arrays;

/**
 * 프로그래머스 문자열 내림차순으로 배치하기
 */
public class StringDescendingSorter {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";

        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        answer = new StringBuilder(new String(temp)).reverse().toString();

        return answer;
    }
}
