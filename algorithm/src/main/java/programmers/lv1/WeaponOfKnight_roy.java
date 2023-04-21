package programmers.lv1;

import java.util.Arrays;

public class WeaponOfKnight_roy {
    public static void main(String[] args) {
        System.out.println(solution(10, 3, 2));
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        int[] divisorArr = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    divisorArr[i]++;
                } else if (i % j == 0) {
                    divisorArr[i] += 2;
                }
            }
        }

        answer = Arrays.stream(divisorArr).map(i -> i > limit ? power : i).sum();

        return answer;
    }
}
