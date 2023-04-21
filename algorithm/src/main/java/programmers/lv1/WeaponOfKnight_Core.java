package programmers.lv1;

public class WeaponOfKnight_Core {
    public static void main(String[] args) {
        System.out.println(solution(10, 3, 2));
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int cnt;
        int i = 0;
        int[] aliquots = new int[number];

        // 1부터 number 까지 반복함
        for (int n = 1; n <= number; n++) {
            // 약수를 구함
            cnt = 1;
            // 해당 숫자의 절반까지만 확인함
            for (int j = 1; j <= n / 2; j++) {
                if (n % j == 0) {
                    cnt++;
                }
            }
            aliquots[i++] = cnt;
        }

        for (int n : aliquots) {
            if (n <= limit) {
                answer += n;
            } else {
                answer += power;
            }
        }

        return answer;
    }
}
