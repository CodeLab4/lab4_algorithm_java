package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 프로그래머스 12915. 문자열 내 마음대로 정렬하기
public class SortStrings_Hana {
    public static void main(String[] args) {

        // case1
//        String[] strings = {"sun", "bed", "car"};
//        int n = 1;

        //case2
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        System.out.println(Arrays.toString(solution(strings, n)));
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = {};

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            stringList.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(stringList);
        answer = new String[stringList.size()];
        for (int i = 0; i < stringList.size(); i++) {
            answer[i] = stringList.get(i).substring(1);
        }

        return answer;
    }
}