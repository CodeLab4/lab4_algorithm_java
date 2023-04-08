package z.programmers.lv2;

public class TargetNumber_Birdie {
    /**
     * from collections import deque
     *
     * def solution(numbers, target):
     *     answer = 0
     *     queue = deque()
     *     queue.append((0, 0))
     *     while queue:
     *         total_sum, index = queue.popleft()
     *
     *         if index == len(numbers):
     *             if total_sum == target:
     *                 answer += 1
     *         else:
     *             current_num = numbers[index]
     *             queue.append((total_sum - current_num, index + 1))
     *             queue.append((total_sum + current_num, index + 1))
     *
     *     return answer
     *
     * numbers = [1, 1, 1, 1, 1]
     * target = 3
     *
     * print(solution(numbers, target))
     */
}
