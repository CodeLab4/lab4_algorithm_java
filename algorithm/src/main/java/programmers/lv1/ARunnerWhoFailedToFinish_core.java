package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;

public class ARunnerWhoFailedToFinish_core {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo"}, new String[]{}));
    }

    /**
     * 배열의 정렬로 풀기
     */
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        if (participant.length == 1) {
            return participant[0];
        }

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
            answer = participant[i + 1];
        }
        return answer;
    }

    /**
     * 해시맵으로 풀기!
     */
    public static String solution2(String[] participant, String[] completion) {
        HashMap<String, Integer> hm = new HashMap<>();
        String answer = "";

        for (String people : participant) {
            hm.put(people, hm.getOrDefault(people, 0) + 1);
        }
        for (String people : completion) {
            hm.put(people, hm.get(people) - 1);
        }

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                return key;
            }
        }
        return answer;
    }
}
