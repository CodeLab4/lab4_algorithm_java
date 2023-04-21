package z_legacy.programmers;

public class DeckOfCards_roy {
    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        String answer = "Yes";

        int card1Index = 0;
        int card2Index = 0;

        for (int i = 0; i < goal.length; i++) {
            if (card1Index < cards1.length && goal[i].equals(cards1[card1Index])) {
                card1Index++;
                continue;
            }

            if (card2Index < cards2.length && goal[i].equals(cards2[card2Index])) {
                card2Index++;
                continue;
            }

            answer = "No";
            break;
        }

        System.out.println(answer);
    }
}
