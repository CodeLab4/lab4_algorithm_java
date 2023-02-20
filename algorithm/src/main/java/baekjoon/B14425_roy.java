package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class B14425_roy {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int answer = 0;
        Set<String> sSet = new HashSet<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sSet.add(bufferedReader.readLine());
        }

        for (int i = 0; i < m; i++) {
            list.add(bufferedReader.readLine());
        }

        for (int i = 0; i < list.size(); i++) {
            if (sSet.contains(list.get(i))) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
