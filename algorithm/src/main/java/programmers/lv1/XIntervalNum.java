package programmers.lv1;

import java.util.Arrays;

/**
 * 프로그래머스 Lv.1 x만큼 간격이 있는 n
 */
public class XIntervalNum {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        long[] answer = solution(x, y);
        System.out.println(Arrays.toString(answer));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = 0;

        for (int i = 0; i < n; i++) {
            answer[i] = (long) x + num;
            num = answer[i];
        }

        return answer;
    }
}
