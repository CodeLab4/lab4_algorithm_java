package z.programmers;

import java.util.ArrayList;
import java.util.List;

public class PasswordForTwo_roy {
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        String answer = "";

        StringBuilder stringBuilder = new StringBuilder();
        char[] arr = s.toCharArray();
        char[] skipArr = skip.toCharArray();

        List<Character> list = new ArrayList<>();
        for (char c : skipArr) {
            list.add(c);
        }

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            int cnt = 0;
            while (cnt < index) {
                ch++;
                if (ch > 122) {
                    ch = 97;
                }
                if (list.contains(ch)) {
                    continue;
                }
                cnt++;
            }
            stringBuilder.append(ch);
        }

        answer = stringBuilder.toString();
        System.out.println(answer);
    }
}
