package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class HallOfFame_1_Core {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hallOfFame = new LinkedList<>();

        for (int i = 0; i < score.length; i++) {
            // 명예의 전당에 정원이 다 안차면 비교 없이 추가함
            if (hallOfFame.size() < k) {
                hallOfFame.add(score[i]);
                Collections.sort(hallOfFame);
                answer[i] = hallOfFame.get(0);
                continue;
            }

            // 명예의 전당 내 가장 낮은 점수와 새로운 점수 비교
            if (hallOfFame.get(0) < score[i]) {
                hallOfFame.set(0, score[i]);
            }

            Collections.sort(hallOfFame);

            answer[i] = hallOfFame.get(0);
        }

        return answer;
    }
}
