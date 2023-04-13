package programmers.lv1;

public class smallSubstring_roy {
    public static void main(String[] args) {
        System.out.println(solution("314314314314314314", "271271271271271271"));
    }

    public static int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            StringBuilder sb = new StringBuilder();
            int cnt = 0;
            while (cnt < p.length()) {
                sb.append(t.charAt(i + cnt++));
            }

            if (Long.parseLong(sb.toString()) <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }
}
