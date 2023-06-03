package programmers.lv2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class NumberConversion_roy {
    public static void main(String[] args) {
        System.out.println(solution(10, 40, 30));
    }

    public static int solution(int x, int y, int n) {
        int answer = 0;
        answer = bfs(x, y, n);
        return answer;
    }

    public static int bfs(int x, int y, int n) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        int depth = 0;

        queue.add(x);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int temp = queue.poll();

                if (temp == y) {
                    return depth;
                }

                if (temp * 2 <= y && !set.contains(temp * 2)) {
                    queue.add(temp * 2);
                    set.add(temp * 2);
                }
                if (temp * 2 <= y && !set.contains(temp * 3)) {
                    queue.add(temp * 3);
                    set.add(temp * 3);
                }
                if (temp * 2 <= y && !set.contains(temp + n)) {
                    queue.add(temp + n);
                    set.add(temp + n);
                }
            }
            depth++;
        }
        return -1;
    }
}
