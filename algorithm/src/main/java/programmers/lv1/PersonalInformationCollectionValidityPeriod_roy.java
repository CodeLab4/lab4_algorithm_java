package programmers.lv1;

import java.util.*;

public class PersonalInformationCollectionValidityPeriod_roy {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};

        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (String s : terms) {
            String[] temp = s.split(" ");
            map.put(temp[0], Integer.parseInt(temp[1]) * 28);
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] pSplit = privacies[i].split(" ");
            int valid = map.get(pSplit[1]);
            if (cal(pSplit[0], valid, today)) {
                list.add(i + 1);
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public boolean cal(String date, int valid, String today) {
        int[] dateSplit = Arrays.stream(date.split("\\.")).mapToInt(Integer::parseInt).toArray();
        int[] todaySplit = Arrays.stream(today.split("\\.")).mapToInt(Integer::parseInt).toArray();

        while (valid > 1) {
            dateSplit[2]++;
            valid--;

            if (dateSplit[2] > 28) {
                dateSplit[2] = 1;
                dateSplit[1]++;
            }

            if (dateSplit[1] > 12) {
                dateSplit[1] = 1;
                dateSplit[0]++;
            }
        }

        int todayResult = todaySplit[0] * 12 * 28 + todaySplit[1] * 28 + todaySplit[2];
        int dateResult = dateSplit[0] * 12 * 28 + dateSplit[1] * 28 + dateSplit[2];

        if (dateResult >= todayResult) {
            return false;
        }

        return true;
    }
}
