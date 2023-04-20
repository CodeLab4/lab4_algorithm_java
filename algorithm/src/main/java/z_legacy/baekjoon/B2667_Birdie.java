package z_legacy.baekjoon;

public class B2667_Birdie {
    /**
     * from collections import deque
     *
     * map_size = int(input())
     * answer= []
     * map = []
     *
     * for _ in range(map_size):
     *     map.append(list(input()))
     *
     * dx = [0, 0, -1, 1]
     * dy = [-1, 1, 0, 0]
     *
     * def bfs(x, y):
     *     queue = deque()
     *     count = 0
     *     if map[y][x] == '1':
     *         count += 1
     *         map[y][x] = '0'
     *         queue.append((x, y))
     *
     *     while queue:
     *         coordinate = queue.popleft()
     *         now_x = coordinate[0]
     *         now_y = coordinate[1]
     *
     *         for i in range(4):
     *             move_x = now_x + dx[i]
     *             move_y = now_y + dy[i]
     *
     *             if move_x < 0 or move_y < 0 or move_x >=map_size or move_y >= map_size:
     *                 continue
     *             if map[move_y][move_x] == '0':
     *                 continue
     *             if map[move_y][move_x] == '1':
     *                 queue.append((move_x, move_y))
     *                 map[move_y][move_x] = '0'
     *                 count += 1
     *     return count
     *
     *
     * for i in range(map_size):
     *     for j in range(map_size):
     *         tmp = bfs(j, i)
     *         if tmp > 0:
     *             answer.append(tmp)
     *
     * answer.sort()
     *
     * print(len(answer))
     * for i in answer:
     *     print(i)
     */
}
