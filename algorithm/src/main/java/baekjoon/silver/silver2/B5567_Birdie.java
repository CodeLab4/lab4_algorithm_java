package baekjoon.silver.silver2;

public class B5567_Birdie {
    // 지저분한 문제 비추천
    /**
     * number = int(input())
     * link = int(input())
     *
     * invite = set()
     *
     * graph = [[] for i in range(1, number + 1)]
     *
     * for i in range(link):
     *     from_person, to_person = map(int, input().split())
     *     graph[from_person - 1].append(to_person)
     *
     * first_friends = []
     *
     * for i in graph[0]:
     *     first_friends.append(i)
     *     invite.add(i)
     *
     * for i in range(1, len(graph)):
     *     for j in (graph[i]):
     *         if j in first_friends:
     *             invite.add(i + 1)
     *
     * for i in first_friends:
     *     list = graph[i - 1]
     *     for j in list:
     *         invite.add(j)
     *
     * print(len(invite))
     */
}
