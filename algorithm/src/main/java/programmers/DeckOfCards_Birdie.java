package programmers;

public class DeckOfCards_Birdie {

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < goal.length; i++) {
            String check = goal[i];

            if (index1 < cards1.length) {
                if (check.equals(cards1[index1])) {
                    index1++;
                    continue;
                }
            }
            if (index2 < cards2.length) {


                if (check.equals(cards2[index2])) {
                    index2++;
                    continue;
                }
            }
            return "No";
        }

        return "Yes";
    }
}
