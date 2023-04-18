package baekjoon.gold.gold5;

public class B10026_Birdie {
    /**
     * 고뭉남을 추모하며....
     *
     * from collections import *
     *
     * line = int(input())
     *
     * map = [list(input())for _ in range(line)]
     * dx = [0, 0, -1, 1]
     * dy = [-1, 1, 0, 0]
     *
     * visited_color_weakness = [[False for _ in range(len(map))] for _ in range(line)]
     * visited_normal = [[False for _ in range(len(map))] for _ in range(line)]
     *
     *
     * # 적록색약 R == G , B
     * def color_weakness(x, y):
     *     queue = deque()
     *     queue.append((x, y))
     *     if visited_color_weakness[y][x] == True:
     *         return 0
     *     visited_color_weakness[y][x] = True
     *     color = map[y][x]
     *     if color == 'G':
     *         color = 'R'
     *
     *     while queue:
     *         x, y = queue.popleft()
     *
     *         for i in range(4):
     *             move_x = x + dx[i]
     *             move_y = y + dy[i]
     *
     *             if move_x < 0 or move_y < 0 or move_x >= line or move_y >= line:
     *                 continue
     *             moved_color = map[move_y][move_x]
     *             if moved_color == 'G':
     *                 moved_color = 'R'
     *
     *             # 색이 다르거나, 이미 방문한 경우 넘어가기
     *             if color != moved_color or visited_color_weakness[move_y][move_x] == True:
     *                 continue
     *
     *             if color == moved_color and visited_color_weakness[move_y][move_x] == False:
     *                 visited_color_weakness[move_y][move_x] = True
     *                 queue.append((move_x, move_y))
     *
     *     return 1
     *
     * # 정상
     * def no_color_weakness(x, y):
     *     queue = deque()
     *     if visited_normal[y][x] == True:
     *         return 0
     *     visited_normal[y][x] = True
     *     queue.append((x, y))
     *     color = map[y][x]
     *
     *     while queue:
     *         x, y = queue.popleft()
     *
     *         for i in range(4):
     *             move_x = x + dx[i]
     *             move_y = y + dy[i]
     *
     *             if move_x < 0 or move_y < 0 or move_x >= line or move_y >= line:
     *                 continue
     *             moved_color = map[move_y][move_x]
     *
     *             # 색이 다르거나, 이미 방문한 경우 넘어가기
     *             if color != moved_color or visited_normal[move_y][move_x] == True:
     *                 continue
     *
     *             if color == moved_color and visited_normal[move_y][move_x] == False:
     *                 visited_normal[move_y][move_x] = True
     *                 queue.append((move_x, move_y))
     *
     *     return 1
     *
     *
     * # 적록색약 아닌 경우 , 적록색약인 경우
     *
     * normal_answer = 0
     * color_weakness_answer = 0
     * for i in range(line):
     *     for j in range(line):
     *         normal_answer += no_color_weakness(j, i)
     *         color_weakness_answer += color_weakness(j, i)
     *
     * print(normal_answer, color_weakness_answer)
     */
}
