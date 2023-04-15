package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class HallOfFame_1_roy {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000})));
        System.out.println(Arrays.toString(solution(5, new int[]{2, 3, 1})));
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new LinkedList<>();

        if (k > score.length) {
            for (int i = 0; i < score.length; i++) {
                list.add(score[i]);
                answer[i] = Collections.min(list);
            }
            return answer;
        }

        for (int i = 0; i < k; i++) {
            list.add(score[i]);
            answer[i] = Collections.min(list);
        }

        for (int i = k; i < score.length; i++) {
            if (score[i] > Collections.min(list)) {
                list.add(score[i]);
                list.remove(Collections.min(list));
            }
            answer[i] = Collections.min(list);
        }
        return answer;
    }
}
