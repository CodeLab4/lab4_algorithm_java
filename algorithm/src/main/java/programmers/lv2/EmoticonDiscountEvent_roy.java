package programmers.lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmoticonDiscountEvent_roy {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solution(new int[][]{{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}},
//                new int[]{1300, 1500, 1600, 4900})));

        System.out.println(Arrays.toString(solution(new int[][]{{40, 10000}, {25, 10000}},
                new int[]{7000, 9000})));
    }

    static List<int[]> list;
    static int[] dis = new int[]{10, 20, 30, 40};

    public static int[] solution(int[][] users, int[] emoticons) {
        // 1. 각 이모티콘에 맞는 할인율 조합
        // 2. 유저 배열을 순회하며 구매 비용과 플러스 가입 계산
        // 3. 결과 리스트에서 가입자가 많고 판매액이 최대인 결과 반환


        int[] answer = new int[2];
        list = new ArrayList<>();
        List<int[]> result = new ArrayList<>();
        com(0, emoticons.length, 0, new int[emoticons.length]);

        int cnt = 0;
        while (cnt < list.size()) {
            int userPlus = 0;
            int userSum = 0;

            for (int i = 0; i < users.length; i++) {
                int sum = 0;
                int[] discount = list.get(cnt);
                for (int j = 0; j < emoticons.length; j++) {
                    if (users[i][0] <= discount[j]) {
                        sum += emoticons[j] - emoticons[j] * discount[j] / 100;
                    }
                }
                if (sum >= users[i][1]) {
                    userPlus++;
                    sum = 0;
                }
                userSum += sum;
            }

            cnt++;
            result.add(new int[]{userPlus, userSum});
        }

        result.sort((o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o2[1] - o1[1];
            } else {
                return o2[0] - o1[0];
            }
        });


        answer = result.get(0);

        return answer;
    }

    public static void com(int idx, int size, int depth, int[] arr) {
        if (size == depth) {
            int[] temp = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            list.add(temp);
            return;
        }

        for (int i = 0; i < 4; i++) {
            arr[idx] = dis[i];
            com(idx + 1, size, depth + 1, arr);
        }
    }
}
