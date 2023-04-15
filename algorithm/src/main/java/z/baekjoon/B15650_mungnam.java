package z.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B15650_mungnam {

    private static int N, M;
    private static int[] array;
    private static final StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());

        array = new int[M];

        dfs(0, 0);

        bw.write(stringBuilder.toString());
        bw.newLine();

        bw.flush();
        bw.close();
    }

    private static void dfs(int depth, int start) {

        if (depth == M) {
            for (int i = 0; i < array.length; i++) {
                stringBuilder.append((array[i] + 1) + " ");
            }
            stringBuilder.append("\n");
            return;
        }

        for (int i = start; i < N; i++) {
            array[depth] = i;
            dfs(depth + 1, i + 1);
        }
    }
}
