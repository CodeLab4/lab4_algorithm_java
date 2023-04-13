package programmers.lv1;

/**
 * 프로그래머스 Lv.1 약수의 합
 */
public class SumOfDivisors_Hana {
    public static void main(String[] args) {
        int n = 12;
//        int n = 5;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer = answer + i;
            }
        }

        return answer;
    }
}
