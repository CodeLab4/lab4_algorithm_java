package z.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B14425_Birdie {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        int answer = 0;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < first; i++) {
            map.put(br.readLine(), 0);
        }

        for (int i = 0; i < second; i++) {
            if (map.containsKey(br.readLine())) {
                answer++;
            }
        }

        System.out.println(answer);
    }

}
