package z_legacy.programmers;

public class TwoSecret_Birdie {
    public String solution(String s, String skip, int index) {

        String answer = "";

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < index; j++) {
                do {
                    chars[i]++;
                    if (chars[i] > 122) {
                        chars[i] = 97;
                    }
                } while (skip.contains(String.valueOf(chars[i])));
            }
        }

        answer = new String(chars);

        return answer;
    }
}
