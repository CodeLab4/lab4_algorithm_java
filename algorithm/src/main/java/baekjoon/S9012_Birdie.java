package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S9012_Birdie {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        for (int i = 0; i < test; i++) {
            Stack<String> stack = new Stack<>();
            String input = br.readLine();
            String[] s = input.split("");
            int no = 0;

            for (int j = 0; j < s.length; j++) {
                if (s[j].equals("(")) {

                    stack.push(s[j]);
                } else if (stack.isEmpty()) {
                    System.out.println("NO");
                    no++;
                    break;
                } else if (s[j].equals(")")) {
                    String pop = stack.pop();
                    continue;
                }
            }
            if (stack.isEmpty() && no == 0) {
                System.out.println("YES");
            }
            if(!stack.isEmpty() && no == 0){
                System.out.println("NO");
            }
        }
    }
}
