package baekjoon.gold.gold5;

public class B7576_Birdie {
    /**
     * from collections import deque
     *
     * width, height = map(int, input().split())
     * graph = [list(map(int, input().split())) for _ in range(height)]
     *
     * dx = [0, 0, 1, -1]
     * dy = [-1, 1, 0, 0]
     *
     * def bfs(graph, tomato_list):
     *
     *     answer = -1
     *     queue = deque(tomato_list)
     *     # 여러 방향에서 토마토가 익을 수 있기 때문에 while True 로 한번 감싸준다.
     *     while True:
     *         tmp = []
     *
     *         # 모든 방향에서의 토마토가 다 익으면 answer += 1
     *         while queue:
     *             x, y = queue.popleft()
     *
     *             for i in range(4):
     *                 move_x = dx[i] + x
     *                 move_y = dy[i] + y
     *
     *                 if move_x < 0 or move_y < 0 or move_y >= height or move_x >= width:
     *                     continue
     *                 if graph[move_y][move_x] == 1 or graph[move_y][move_x] == -1:
     *                     continue
     *                 if graph[move_y][move_x] == 0:
     *                     graph[move_y][move_x] = 1
     *                     tmp.append((move_x, move_y))
     *
     *         answer += 1
     *
     *         if len(tmp) == 0:
     *             break
     *
     *         queue.extend(tmp)
     *
     *     return answer
     *
     * # bfs가 끝나고 안익은 토마토가 남아있는지 확인한다.
     * def check_all(graph):
     *     for i in range(height):
     *         for j in range(width):
     *             if graph[i][j] == 0:
     *                 return False
     *     return True
     *
     * # 시작 위치 찾아준다.
     * def findTomato(graph):
     *     tomato_list = []
     *     for i in range(height):
     *         for j in range(width):
     *             if graph[i][j] == 1:
     *                tomato_list.append((j, i))
     *
     *     return tomato_list
     *
     * tomato = findTomato(graph)
     * tmp = bfs(graph, tomato)
     *
     * if check_all(graph):
     *     print(tmp)
     * else:
     *     print(-1)
     */
}
