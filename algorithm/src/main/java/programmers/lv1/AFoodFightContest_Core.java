package programmers.lv1;

public class AFoodFightContest_Core {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 7, 1, 2}));
    }

    public static String solution(int[] food) {
        // 왼쪽 만들기
        StringBuilder leftSide = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int half = food[i] / 2;
            for (int j = 0; j < half; j++) {
                leftSide.append(i);
            }
        }

        // 오른쪽 만들기
        StringBuilder rightSide = new StringBuilder(leftSide).reverse();

        return leftSide.append(0).append(rightSide).toString();
    }
}

