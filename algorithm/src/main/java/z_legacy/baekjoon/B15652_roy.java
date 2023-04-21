package z_legacy.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B15652_roy {
    static StringBuilder stringBuilder;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        stringBuilder = new StringBuilder();
        int[] input = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        recursion(input[0], input[1], 0, 1, "");

        System.out.println(stringBuilder);
    }

    static void recursion(int n, int m, int depth, int idx, String str) {
        if (depth == m) {
            str = str.substring(1);
            stringBuilder.append(str).append("\n");
            return;
        }

        for (int i = idx; i <= n; i++) {
            recursion(n, m, depth + 1, idx, str + " " + i);
            idx++;
        }
    }
}
