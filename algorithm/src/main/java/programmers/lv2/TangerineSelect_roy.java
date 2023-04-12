package programmers.lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TangerineSelect_roy {
    public static void main(String[] args) {
//        System.out.println(solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(1, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;

        int[] cnt = new int[11];
        for (int i = 0; i < tangerine.length; i++) {
            cnt[tangerine[i]]++;
        }

        Arrays.sort(cnt);
        for (int i = cnt.length; i > 0; i--) {
            k -= cnt[i - 1];
            answer++;
            if(k <= 0) {
                break;
            }
        }
        return answer;
    }
}
