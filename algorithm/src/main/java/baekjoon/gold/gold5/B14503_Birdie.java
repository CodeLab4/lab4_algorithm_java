package baekjoon.gold.gold5;

public class B14503_Birdie {
    /**
     * ## 북, 동, 남, 서 ( 시계방향 )
     * dy = [-1, 0, 1, 0]
     * dx = [0, 1, 0, -1]
     *
     * width, height = map(int, input().split())
     * y, x, direction = map(int, input().split())
     * graph = [list(map(int, input().split())) for _ in range(width)]
     *
     * visited = [[0] * height for _ in range(width)]
     *
     * visited[y][x] = 1
     * answer = 1
     *
     * while True:
     *     flag = 0
     *     # 상하좌우 확인
     *     for _ in range(4):
     *
     *         # 반시계방향으로 확인
     *         direction = (direction + 3) % 4
     *         next_y = y + dy[direction]
     *         next_x = x + dx[direction]
     *
     *         if 0 <= next_y < width and 0 <= next_x < height and graph[next_y][next_x] == 0:
     *             if visited[next_y][next_x] == 0:
     *                 visited[next_y][next_x] = 1
     *                 answer += 1
     *                 y = next_y
     *                 x = next_x
     *                 flag = 1
     *                 break
     *
     *     if flag == 0:
     *
     *         if graph[y - dy[direction]][x - dx[direction]] == 1:
     *             print(answer)
     *             break
     *         else:
     *             y, x = y - dy[direction], x - dx[direction]
     */
}
