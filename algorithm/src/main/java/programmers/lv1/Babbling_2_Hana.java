package programmers.lv1;

public class Babbling_2_Hana {
    public static void main(String[] args) {
        String[] babbling = {"ayayaa", "yee", "u", "maa"};
//        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(babbling));
    }

    public static int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {

            // 머쓱이는 연속해서 같은 발음이 어렵다.
            if (babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) {
                continue;
            }

            // 발음할 수 있는 단어가 있으면 공백으로 바꾼다.
            babbling[i] = babbling[i].replaceAll("aya", " ");
            babbling[i] = babbling[i].replaceAll("ye", " ");
            babbling[i] = babbling[i].replaceAll("woo", " ");
            babbling[i] = babbling[i].replaceAll("ma", " ");

            // 인덱스에 공백만 있을 경우 카운트한다.
            if (!babbling[i].matches(".*[a-zA-Z].*")) {
                answer++;
            }
        }

        return answer;
    }
}
