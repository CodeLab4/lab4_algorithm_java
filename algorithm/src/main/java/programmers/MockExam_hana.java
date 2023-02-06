package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockExam_hana {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] answers = {1, 2, 3, 4, 5};
        int[] answers = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(solution.solution(answers)));
    }

    public static class Solution {
        public int[] solution(int[] answers) {
            int[] answer = {};

            int[] first = {1, 2, 3, 4, 5}; // 5
            int[] second = {2, 1, 2, 3, 2, 4, 2, 5}; // 8
            int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10
            int[] score = {0, 0, 0};

            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == first[i % 5]) {
                    score[0]++;
                }
                if (answers[i] == second[i % 8]) {
                    score[1]++;
                }
                if (answers[i] == third[i % 10]) {
                    score[2]++;
                }
            }

            int max = Math.max(score[0], Math.max(score[1], score[2]));

            List<Integer> maxScore = new ArrayList<>();
            for (int i = 0; i < score.length; i++) {
                if (max == score[i]) {
                    maxScore.add(i + 1);
                }
            }

            answer = maxScore.stream().mapToInt(Integer::intValue).toArray();

            return answer;
        }
    }
}
