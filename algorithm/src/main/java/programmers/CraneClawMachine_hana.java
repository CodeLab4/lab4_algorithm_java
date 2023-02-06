package programmers;

import java.util.Stack;

public class CraneClawMachine_hana {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] board = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}};
        int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution.solution(board, moves));
    }

    public static class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;

            Stack<Integer> basket = new Stack<>();
            for (int i = 0; i < moves.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[j][moves[i] - 1] != 0) {
                        if (!basket.empty() && board[j][moves[i] - 1] == basket.peek()) {
                            board[j][moves[i] - 1] = 0;
                            basket.pop();
                            answer += 2;
                            break;
                        }
                        basket.add(board[j][moves[i] - 1]);
                        board[j][moves[i] - 1] = 0;
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
