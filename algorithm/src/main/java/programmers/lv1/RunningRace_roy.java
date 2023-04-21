package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class RunningRace_roy {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for(int i = 0; i < callings.length; i++) {
            int idx = map.get(callings[i]);
            map.replace(players[idx - 1], map.get(players[idx - 1]) + 1);
            map.replace(players[idx], map.get(players[idx]) - 1);

            String temp = players[idx - 1];
            players[idx - 1] = players[idx];
            players[idx] = temp;
        }

        answer = players;
        return answer;
    }
}
