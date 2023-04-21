package z_legacy.programmers.lv2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterNumber_mungnam {

    /**
     * 계속 테스트 20번부터 시간 초과로 통과하지 못했다 ...
     * 다른 사람들의 풀이를 보고 힌트를 얻어 스택으로 풀어보려 했으나, 도무지 방법이 떠오르질 않았다.
     * 스택을 사용해서 푼 나의 풀이도 테스트 20번부터는 계속 시간 초과가 났다.
     * 결국 풀이를 봤고, 애초에 내가 접근하던 방식과는 거리가 멀었기 때문에 좀 놀랐다.
     * 이런 식으로 풀 수 있음을 알 수 있는 문제였고, 다음에 다시 한번 풀어봐야겠다.
     */
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = {9, 1, 5, 3, 6, 2};

        int[] result = solution(numbers);

        bw.write(Arrays.toString(result));
        bw.newLine();

        bw.flush();
        bw.close();
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = numbers.length - 1; i >= 0; i--) {
            while (!stack.empty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }
            answer[i] = stack.empty() ? -1 : stack.peek();
            stack.push(numbers[i]);
        }

        return answer;
    }
}

