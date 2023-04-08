package z.programmers.lv2;

public class SavingBoat_Birdie {
    /**
     * from collections import deque
     * def solution(people, limit):
     *     answer = 0
     *     people.sort()
     *     queue = deque(sorted(people))
     *
     *     while queue:
     *         if queue[0] + queue[len(queue) - 1] <= limit and len(queue) >= 2:
     *             answer += 1
     *             queue.pop()
     *             queue.popleft()
     *         elif queue[len(queue) - 1] > limit / 2:
     *             queue.pop()
     *             answer += 1
     *         if len(queue) == 1:
     *             answer += 1
     *             queue.pop()
     *
     *     return answer
     *
     * people = [70, 50, 80, 50]
     * people = [70, 80, 50]
     * limit = 100
     * print(solution(people, limit))
     */
}
