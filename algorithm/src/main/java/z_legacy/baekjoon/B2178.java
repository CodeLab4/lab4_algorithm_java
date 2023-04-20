package z_legacy.baekjoon;

public class B2178 {
    /**
     * from collections import deque
     *
     * height, width = map(int, input().split())
     *
     * graph = [[] for _ in range(height)]
     *
     * for hei in range(height):
     *     tmp = input()
     *     int_list = [int(x) for x in tmp]
     *     graph[hei] = int_list
     *
     * queue = deque()
     *
     * # 상 하 좌 우
     * dx = [0, 0, -1, 1]
     * dy = [-1, 1, 0, 0]
     *
     *
     * def bfs():
     *     queue.append([0, 0])
     *
     *     while queue:
     *         now_coordinate = queue.popleft()
     *         now_X = now_coordinate[0]
     *         now_Y = now_coordinate[1]
     *
     *         for i in range(4):
     *             moved_X = now_X + dx[i]
     *             moved_Y = now_Y + dy[i]
     *
     *             if moved_X < 0 or moved_X >= width or moved_Y < 0 or moved_Y >= height:
     *                 continue
     *
     *             elif graph[moved_Y][moved_X] == 0:
     *                 continue
     *
     *             elif graph[moved_Y][moved_X] == 1:
     *                 graph[moved_Y][moved_X] = graph[now_Y][now_X] + 1
     *                 queue.append([moved_X, moved_Y])
     *                 if moved_Y + 1 == height and moved_X + 1== width:
     *                     return graph[height - 1][width - 1]
     *
     * print(bfs())
     */
}
