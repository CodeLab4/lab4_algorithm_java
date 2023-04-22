package programmers.lv1;

import java.util.*;

public class NumberPartner_Core {
    public static void main(String[] args) {
        System.out.println(solution("100", "203045"));
    }

    public static String solution(String X, String Y) {
        Map<String, Integer> map = new HashMap<>();
        String[] strX = X.split("");
        String[] strY = Y.split("");
        boolean isAllZero = true;

        for (int i = 0; i < strX.length; i++) {
            map.put(strX[i], map.getOrDefault(strX[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < strY.length; i++) {
            if (map.containsKey(strY[i]) && map.get(strY[i]) != 0) {
                list.add(Integer.parseInt(strY[i]));
                map.put(strY[i], map.get(strY[i]) - 1);
            }
        }

        // 공통된 요소가 하나도 없으면 -1 반환
        if (list.size() == 0) {
            return String.valueOf(-1);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                isAllZero = false;
            }
        }

        if (isAllZero) {
            return String.valueOf(0);
        }

        // 공통 요소가 저장된 리스트를 역순으로 정렬
        Collections.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num);
        }

        return sb.toString();
    }
}
