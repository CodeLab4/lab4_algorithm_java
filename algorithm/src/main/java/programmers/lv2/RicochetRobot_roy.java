package programmers.lv2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RicochetRobot_roy {
	static int[] dRow = {1, -1, 0, 0};
	static int[] dCol = {0, 0, 1, -1};

	public static void main(String[] args) {
		System.out.println(solution(new String[] {"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."}));
	}

	public static int solution(String[] board) {
		int INF = Integer.MAX_VALUE;
		int[][] dist = new int[board.length][board[0].length()];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length(); j++) {
				dist[i][j] = INF;
			}
		}

		int[] start = new int[2];
		int[] target = new int[2];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length(); j++) {
				if (board[i].charAt(j) == 'R') {
					start = new int[] {i, j};
				}

				if (board[i].charAt(j) == 'G') {
					target = new int[] {i, j};
				}
			}
		}

		bfs(board, dist, start);

		if (dist[target[0]][target[1]] == INF) {
			return -1;
		}

		return dist[target[0]][target[1]];
	}

	public static void bfs(String[] board, int[][] dist, int[] start) {
		PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> dist[o[0]][o[1]]));
		queue.add(start);
		dist[start[0]][start[1]] = 0;

		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			int row = now[0];
			int col = now[1];

			for (int i = 0; i < 4; i++) {
				int nr = row;
				int nc = col;
				int move = 0;

				while (true) {
					int newRow = nr + dRow[i];
					int newCol = nc + dCol[i];

					if (newRow < 0 || newRow >= board.length || newCol < 0 || newCol >= board[0].length() || board[newRow].charAt(newCol) == 'D') {
						break;
					}

					nr = newRow;
					nc = newCol;
					move = 1;
				}

				if (dist[row][col] + move < dist[nr][nc]) {
					dist[nr][nc] = dist[row][col] + move;
					queue.add(new int[] {nr, nc});
				}
			}
		}
		for (int i = 0; i < dist.length; i++) {
			System.out.println(Arrays.toString(dist[i]));
		}
	}
}
