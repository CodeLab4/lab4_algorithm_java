package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class WalkInThePark_roy {
    // 풀이시간 : 1시간
    static int startX;
    static int startY;
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        String[][] arr = new String[park.length][park[0].length()];
        Map<String, int[]> map = new HashMap<>();

        map.put("N", new int[]{-1, 0});
        map.put("E", new int[]{0, 1});
        map.put("S", new int[]{1, 0});
        map.put("W", new int[]{0, -1});

        startX = 0;
        startY = 0;

        for(int i=0; i < park.length; i++) {
            String[] temp = park[i].split("");
            for(int j=0; j < temp.length; j++) {
                arr[i][j] = temp[j];
                if(temp[j].equals("S")) {
                    startX = i;
                    startY = j;
                }
            }
        }

        for(int i = 0; i < routes.length; i++) {
            String[] temp = routes[i].split(" ");
            int[] movePoint = map.get(temp[0]);
            move(arr, startX, startY, movePoint, Integer.parseInt(temp[1]));
        }

        answer[0] = startX;
        answer[1] = startY;
        return answer;
    }

    public void move(String[][] arr, int x, int y, int[] movePoint, int cnt) {
        if(cnt == 0) {
            startX = x;
            startY = y;
            return;
        }

        int nextX = x + movePoint[0];
        int nextY = y + movePoint[1];
        if(nextX >= 0 && nextX < arr.length && nextY >= 0 && nextY < arr[0].length) {
            if(!arr[nextX][nextY].equals("X")) {
                move(arr, nextX, nextY, movePoint, cnt - 1);
            }
        }
    }
}
