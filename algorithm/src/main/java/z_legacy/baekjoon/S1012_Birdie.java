package z_legacy.baekjoon;

public class S1012_Birdie {
    /**
     * from collections import deque
     *
     * dx = [0, 0, -1, 1]
     * dy = [-1, 1, 0, 0]
     * def bfs(x, y):
     *     queue = deque()
     *
     *     queue.append([x, y])
     *
     *     while queue:
     *         pop = queue.pop()
     *         now_x = pop[0]
     *         now_y = pop[1]
     *         for i in range(4):
     *             moved_x = now_x + dx[i]
     *             moved_y = now_y + dy[i]
     *             # 범위를 벗어나면 제외
     *             if moved_x < 0 or moved_y < 0 or moved_y >= height or moved_x >= width:
     *                 continue
     *             # 배추가 심어져 있지 않으면 제외
     *             if graph[moved_y][moved_x] == 0:
     *                 continue
     *             if graph[moved_y][moved_x] == 1:
     *                 graph[moved_y][moved_x] = 0
     *                 queue.append([moved_x, moved_y])
     *     return 1
     *
     * # 테스트 케이스만큼 반복
     * test_case = int(input())
     * for _ in range(test_case):
     *     answer = 0
     *
     *     width, height, bachu = map(int, input().split())
     *     # 0으로 차있는 2차원 배열 만들어주기
     *     graph = [[0 for _ in range(width)] for _ in range(height)]
     *
     *     for i in range(bachu):
     *         a, b = map(int, input().split())
     *         graph[b][a] = 1
     *
     *     for i in range(height):
     *         for j in range(width):
     *             if graph[i][j] == 1:
     *                 answer += bfs(j, i)
     *     print(answer)
     */
}
