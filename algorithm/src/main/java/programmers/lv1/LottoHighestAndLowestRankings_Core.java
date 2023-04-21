package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LottoHighestAndLowestRankings_Core {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int correct = 0;
        int highestScore = 0;
        int lowestScore = 0;
        int zero = 0;
        int diff = 0;

        Map<Integer, Integer> ranks = Map.of(6, 1, 5, 2, 4, 3, 3, 4, 2, 5, 1, 6, 0, 6);

        // 로또 번호를 맵에 넣는다
        HashMap<Integer, Integer> lotto = new HashMap<>();
        for (int number : win_nums) {
            lotto.put(number, 1);
        }

        for (int number : lottos) {
            if (number == 0) {
                zero++;
                continue;
            }
            if (lotto.containsKey(number)) {
                correct++;
            }
        }

        lowestScore = ranks.get(correct);
        highestScore = ranks.get(correct + zero);

        int[] answer = new int[]{highestScore, lowestScore};

        return answer;
    }
}
