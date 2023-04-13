package programmers.lv1;

public class babbling_2_Core {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }

    public static int solution(String[] babbling) {
        String[] canSpeak = {"aya", "ye", "woo", "ma"};
        int count = 0;

        for (int i = 0; i < babbling.length; i++) { // 옹알이 하나씩 탐색
            String word = babbling[i];
            String preWord = ""; // 이전에 확인한 옹알이
            for (int j = 0; j < canSpeak.length; j++) { // 말하기 가능한 단어 비교
                if (!canSpeak[j].equals(preWord) && word.startsWith(canSpeak[j])) { // 직전에 확인한 단어와 같지 않고, 발음 가능한 옹알이와 같다면
                    word = word.replaceFirst(canSpeak[j], "");
                    preWord = canSpeak[j];
                    j = -1;
                }
            }
            if (word.equals("")) {
                count++;
            }

        }
        return count;
    }
}
