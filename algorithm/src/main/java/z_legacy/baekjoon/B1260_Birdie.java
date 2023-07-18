package z_legacy.baekjoon;

public class B1260_Birdie {
}

//from collections import deque
//
//node, link, start = map(int, input().split())
//
//graph = [[] for _ in range(node + 1)]
//
//dfs_visit = [False] * (node + 1)
//bfs_visit = [False] * (node + 1)
//
//for _ in range(link):
//    a, b = map(int, input().split())
//    graph[a].append(b)
//    graph[b].append(a)
//
//# 문제에서 작은 수 부터 들어가도록 요구
//for i in graph:
//    i.sort()
//
//def dfs(start):
//    dfs_visit[start] = True
//    print(start, end=" ")
//    for i in graph[start]:
//        if not dfs_visit[i]:
//             dfs(i)
//
//
//def bfs(start):
//    queue = deque()
//    queue.append(start)
//    bfs_visit[start] = True
//
//    while queue:
//        tmp = queue.popleft()
//        print(tmp, end=" ")
//
//        for i in graph[tmp]:
//            if not bfs_visit[i]:
//                queue.append(i)
//                bfs_visit[i] = True
//
//dfs(start)
//print()
//bfs(start)
