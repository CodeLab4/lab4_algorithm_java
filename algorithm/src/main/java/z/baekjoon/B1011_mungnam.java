package z.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B1011_mungnam {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x, y, distance, result;
        int T = Integer.parseInt(br.readLine());
        StringTokenizer stringTokenizer;

        for (int i = 0; i < T; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            x = Integer.parseInt(stringTokenizer.nextToken());
            y = Integer.parseInt(stringTokenizer.nextToken());
            distance = y - x;
            result = solution(distance);
            bw.write(Integer.toString(result));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    private static int solution(int distance) {
        long x = 0;
        int step = 2;
        while (true) {
            x += step;
            if (x >= distance) {
                if (distance > x - (step / 2)) {
                    return step;
                }
                return step - 1;
            }
            step += 2;
        }
    }
}

