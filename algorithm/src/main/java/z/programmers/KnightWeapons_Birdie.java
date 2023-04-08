package z.programmers;

public class KnightWeapons_Birdie {

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int factors = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    factors++;
                } else if (i % j == 0) {
                    factors += 2;
                }
            }

            if (factors > limit) {
                answer += power;
            } else {
                answer += factors;
            }
        }
        return answer;
    }

}
