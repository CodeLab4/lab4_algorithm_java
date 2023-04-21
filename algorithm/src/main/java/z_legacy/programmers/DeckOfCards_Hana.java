package z_legacy.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class DeckOfCards_Hana {
    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};        // card1 case1(Yes)
//        String[] cards1 = {"i", "water", "drink"};  // card1 case2(No)
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(cards1, cards2, goal));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        ArrayList<String> cards1Arr = new ArrayList<>(Arrays.asList(cards1));
        ArrayList<String> cards2Arr = new ArrayList<>(Arrays.asList(cards2));
        int count = 0;

        for (int i = 0; i < goal.length; i++) {
            if (cards1Arr.size() != 0 && goal[i].equals(cards1Arr.get(0))) {
                count++;
                cards1Arr.remove(0);
                continue;
            }
            if (cards2Arr.size() != 0 && goal[i].equals(cards2Arr.get(0))) {
                count++;
                cards2Arr.remove(0);
            }
        }

        answer = "No";

        if (goal.length == count) {
            answer = "Yes";
        }

        return answer;
    }
}
