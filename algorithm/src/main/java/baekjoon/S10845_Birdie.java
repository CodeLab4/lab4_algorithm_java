package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class S10845_Birdie {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<String> queue = new LinkedList();

        int cycle = Integer.parseInt(br.readLine());

        for (int i = 0; i < cycle; i++) {
            String input = br.readLine();
            String[] tmp = input.split(" ");

            String command = tmp[0];

            if (command.equals("push")) {
                queue.offer(tmp[1]);
            } else if (command.equals("front")) {

                if (queue.size() > 0) {
                    System.out.println(queue.peek());
                }else {
                    System.out.println(-1);
                }

            } else if (command.equals("pop")) {
                if (queue.size() > 0) {
                    System.out.println(queue.poll());
                }else {
                    System.out.println(-1);
                }


            } else if (command.equals("size")) {
                System.out.println(queue.size());

            } else if (command.equals("empty")) {

                if (queue.size() == 0) {
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }

            } else if (command.equals("back")) {

                if (queue.size() > 0) {


                    for (int j = 0; j < queue.size() - 1; j++) {
                        queue.offer(queue.poll());
                    }
                    String poll = queue.poll();
                    System.out.println(poll);
                    queue.offer(poll);
                }else {
                    System.out.println(-1);
                }
            }
        }

    }
}
