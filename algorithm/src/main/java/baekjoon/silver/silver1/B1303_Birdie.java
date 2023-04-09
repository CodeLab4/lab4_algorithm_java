package baekjoon.silver.silver1;

public class B1303_Birdie {
    /**
     * from collections import deque
     *
     * width, height = map(int, input().split())
     *
     * battle_field = []
     * visited = []
     *
     * for _ in range(height):
     *     battle_field.append(list(input()))
     *     visited.append([False] * width)
     * dx = [0, 0, -1, 1]
     * dy = [-1, 1, 0, 0]
     *
     * def bfs(start):
     *     count = 0
     *     global battle_field
     *     queue = deque([(start[0], start[1])])
     *
     *
     *     while queue:
     *         now_x, now_y, = queue.popleft()
     *         if visited[now_y][now_x] == False:
     *             count += 1
     *         visited[now_y][now_x] = True
     *
     *         for i in range(4):
     *             moved_x = now_x + dx[i]
     *             moved_y = now_y + dy[i]
     *
     *             if moved_x < 0 or moved_x >= width or moved_y < 0 or moved_y >= height:
     *                 continue
     *             if battle_field[now_y][now_x] != battle_field[moved_y][moved_x]:
     *                 continue
     *             if battle_field[now_y][now_x] == battle_field[moved_y][moved_x] and visited[moved_y][moved_x] == False:
     *                 visited[moved_y][moved_x] = True
     *                 queue.append((moved_x, moved_y))
     *                 count += 1
     *     return count * count
     *
     * white = 0
     * black = 0
     *
     * for i in range(height):
     *     for j in range(width):
     *         combat_power = bfs([j, i])
     *         if battle_field[i][j] == 'B':
     *             black += combat_power
     *         else:
     *             white += combat_power
     *
     *
     * print(white, black)
     */
}
