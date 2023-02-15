package programmers;

public class Hamburger_Hana {

    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(ingredient));
    }

    public static int solution(int[] ingredient) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();
        for (int i : ingredient) {
            sb.append(i);

            if (sb.length() > 3
                    && sb.substring(sb.length() - 4, sb.length()).equals("1231")) {
                answer++;
                sb.delete(sb.length() - 4, sb.length());
            }
        }
        return answer;

    }
}


