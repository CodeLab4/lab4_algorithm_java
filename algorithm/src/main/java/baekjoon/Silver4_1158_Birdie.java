package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Silver4_1158_Birdie {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");

        int num = Integer.parseInt(st.nextToken());
        int cut = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList();

        for (int i = 1; i <= num; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (queue.size() != 1) {
            for (int i = 0; i < cut - 1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }

}
