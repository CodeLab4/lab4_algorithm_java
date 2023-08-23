package programmers.lv1;

public class OneRemainderSearch {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        int x;
        for (x = 2; x < n; x++) {
            if (n % x == 1) {
                return x;
            }
        }
        x = n - 1;

        return answer = x;
    }
}
