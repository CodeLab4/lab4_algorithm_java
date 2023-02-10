package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class B2018_Birdie {

    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        answer = 1;
        int num = Integer.parseInt(br.readLine());

        Predicate<Integer> check = i -> i + (i + 1) == num;

        IntStream.rangeClosed(1, num)
                .forEach(i -> {
                    if(checkNum(i, num)) {
                        setAnswer();
                    }
                });

        System.out.println(answer);
    }

    public static void setAnswer() {
        answer++;
    }
    public static boolean checkNum(int number, int range) {
        int tmp = number + 1;
        while (number < range) {
            number += tmp;
            tmp ++;
            if (number == range) {
                return true;
            }
        }
        return false;
    }

}
