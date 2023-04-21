package z_legacy.programmers;

import java.util.Stack;

public class CraneClawMachine_roy {
    static int answer;

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        answer = 0;

        Stack<Integer> box = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            int idx = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                if (board[j][idx] != 0) {
                    checkBox(box, board[j][idx]);
                    board[j][idx] = 0;
                    break;
                }
            }
        }
        System.out.println(answer);
    }

    public static void checkBox(Stack<Integer> box, int num) {
        if (!box.isEmpty() && box.peek() == num) {
            box.pop();
            answer += 2;
            return;
        }
        box.add(num);
    }
}
