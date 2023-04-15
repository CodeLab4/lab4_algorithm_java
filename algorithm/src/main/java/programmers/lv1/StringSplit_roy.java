package programmers.lv1;

import java.util.Arrays;

public class StringSplit_roy {
    public static void main(String[] args) {
        System.out.println(solution("abracadabra"));
    }

    public static int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        int cntX = 0;
        int cntY = 0;
        boolean flag = false;
        char ch = '0';

        for (int i = 0; i < s.length(); i++) {
            if (!flag) {
                ch = s.charAt(i);
                flag = true;
            }

            sb.append(s.charAt(i));

            if (s.charAt(i) == ch) {
                cntX++;
            }

            if (s.charAt(i) != ch) {
                cntY++;
            }

            if (cntX == cntY) {
                sb.append(" ");
                flag = false;
                cntX = 0;
                cntY = 0;
            }

        }

        String[] temp = sb.toString().split(" ");
        System.out.println(Arrays.toString(temp));
        answer = temp.length;
        return answer;
    }
}
