package programmers.lv1;

public class DigitSum_Hana {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        String temp = Integer.toString(n);
        String[] digits = temp.split("");

        for (String digit : digits) {
            answer += Integer.parseInt(digit);
        }

        return answer;
    }
}
