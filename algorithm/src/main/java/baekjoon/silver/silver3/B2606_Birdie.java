package baekjoon.silver.silver3;

public class B2606_Birdie {
    /**
     * computer_number = int(input())
     * linked = int(input())
     * graph = [[] * computer_number for _ in range(computer_number + 1)]
     *
     * for _ in range(linked):
     *     a, b = map(int, input().split())
     *     graph[a].append(b)
     *     graph[b].append(a)
     *
     * count = 0
     *
     * visited = [0] * (computer_number + 1)
     *
     * def dfs(start):
     *     global count
     *     visited[start] = 1
     *     for i in graph[start]:
     *         if visited[i] == 0:
     *             dfs(i)
     *             count += 1
     *
     * dfs(1)
     * print(count)
     */
}
