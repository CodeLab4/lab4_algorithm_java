package programmers.lv1;

import java.util.ArrayList;
import java.util.List;

public class DesktopCleanup_roy {
    // 풀이시간 : 1시간
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        String[][] arr = new String[wallpaper.length][wallpaper[0].length()];
        int wallCnt = 0;

        // wallpaper 2차원 배열로 만들기
        for (int i = 0; i < wallpaper.length; i++) {
            String[] temp = wallpaper[i].split("");
            for (int j = 0; j < wallpaper[0].length(); j++) {
                arr[i][j] = temp[j];
                if (temp[j].equals("#")) {
                    wallCnt++;
                }
            }
        }

        List<Integer> rowList = new ArrayList<>();
        List<Integer> columnList = new ArrayList<>();

        // 행 탐색
        int rowCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals("#")) {
                    rowCnt++;
                }
                if (rowList.isEmpty() && arr[i][j].equals("#")) {
                    rowList.add(i);
                }
                if (arr[i][j].equals("#") && rowCnt == wallCnt) {
                    rowList.add(i + 1);
                }
            }
        }

        // 열 탐색
        int columnCnt = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i].equals("#")) {
                    columnCnt++;
                }
                if (columnList.isEmpty() && arr[j][i].equals("#")) {
                    columnList.add(i);
                }
                if (arr[j][i].equals("#") && columnCnt == wallCnt) {
                    columnList.add(i + 1);
                }
            }
        }

        answer[0] = rowList.get(0);
        answer[1] = columnList.get(0);
        answer[2] = rowList.get(1);
        answer[3] = columnList.get(1);
        return answer;
    }
}
