package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class NearestIdenticalLetter_roy {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<String, Integer> map = new HashMap<>();

        String[] temp = s.split("");

        for (int i = 0; i < temp.length; i++) {
            if (map.get(temp[i]) == null) {
                map.put(temp[i], i);
                answer[i] = -1;
                continue;
            }
            answer[i] = i - map.get(temp[i]);
            map.replace(temp[i], i);
        }
        return answer;
    }
}
