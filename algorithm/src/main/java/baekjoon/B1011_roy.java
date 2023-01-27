package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1011_roy {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());

            stringBuilder.append(calculateDistance(x, y)).append("\n");
        }
        System.out.println(stringBuilder);
    }

    public static int calculateDistance(int x, int y) {
        int distance = y - x;
        int target = (int) Math.sqrt(distance);
        int cnt = 0;

        if (target == Math.sqrt(distance)) {
            cnt = target * 2 - 1;
        } else if (distance <= target * target + target) {
            cnt = target * 2;
        } else {
            cnt = target * 2 + 1;
        }
        return cnt;
    }
}
