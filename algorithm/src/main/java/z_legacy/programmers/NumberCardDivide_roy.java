package z_legacy.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberCardDivide_roy {
    public static void main(String[] args) {
        int[] arrayA = {14, 35, 119};
        int[] arrayB = {18, 30, 102};
        int answer = 0;

        List<Integer> listA = new ArrayList<>();
        int minA = Arrays.stream(arrayA).min().getAsInt();

        for (int i = 1; i <= minA; i++) {
            if (minA % i == 0) {
                listA.add(i);
            }
        }

        listA.sort(Collections.reverseOrder());

        int cnt = 0;
        while (true) {
            boolean flag = false;
            int tempA = listA.get(cnt);
            for (int i = 0; i < arrayA.length; i++) {
                if (arrayA[i] % tempA != 0) {
                    cnt++;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }

        int gcdA = listA.get(cnt);

        for (int i = 0; i < arrayB.length; i++) {

        }

        System.out.println(cnt);
        System.out.println(answer);
    }
}
