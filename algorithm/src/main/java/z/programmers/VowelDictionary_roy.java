package z.programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class VowelDictionary_roy {
    public static void main(String[] args) {
        String word = "AAAAE";
        int answer = 0;
        Set<String> set = new TreeSet<>();
        char[] dictionary = {'A', 'E', 'I', 'O', 'U'};

        recursion(dictionary, set, "");

        List<String> list = new ArrayList<>(set);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }

    public static void recursion(char[] dictionary, Set<String> set, String str) {
        if (str.length() > 5) {
            return;
        }

        for (char c : dictionary) {
            set.add(str);
            recursion(dictionary, set, str + c);
        }
    }
}
