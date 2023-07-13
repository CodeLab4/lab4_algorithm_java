package programmers.lv2;

public class GameMapBFS_Birdie {
	/**
	 * from collections import deque
	 *
	 * dx = [0, 0, -1, 1]
	 * dy = [-1, 1, 0, 0]
	 *
	 *
	 * def solution(maps):
	 *     queue = deque()
	 *     queue.append((0, 0))
	 *
	 *     while queue:
	 *         now_x, now_y = queue.popleft()
	 *
	 *         for i in range(4):
	 *             move_x = now_x + dx[i]
	 *             move_y = now_y + dy[i]
	 *
	 *             if move_x < 0 or move_x >= len(maps[0]) or move_y < 0 or move_y >= len(maps):
	 *                 continue
	 *             if maps[move_y][move_x] == 0:
	 *                 continue
	 *             if maps[move_y][move_x] == 1:
	 *                 queue.append((move_x, move_y))
	 *                 maps[move_y][move_x] = maps[now_y][now_x] + 1
	 *
	 *     answer = maps[len(maps) - 1][len(maps[0]) - 1]
	 *     if answer == 1:
	 *         return -1
	 *     return answer
	 */
}
