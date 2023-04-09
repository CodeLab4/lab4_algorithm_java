package programmers.lv2;

public class Printer {
    /**
     * from collections import deque
     *
     * def solution(priorities, location):
     *     answer = 0
     *     queue = deque()
     *     # (우선순위, 순서) 를 가지는 queue 생성
     *     for i in range(len(priorities)):
     *         queue.append((priorities[i], i))
     *
     *     # queue 내의 최대값을 매번 갱신
     *     while queue:
     *         max_priority = max(queue)[0]
     *
     *         pop = queue.popleft()
     *
     *         # 최대값보다 크거나 같으면 출력, 아닐경우 queue의 맨 끝에 추가
     *         if int(pop[0]) >= max_priority:
     *             answer += 1
     *             # 원하는 순서의 값이 최대값일 경우 출력
     *             if int(pop[1]) == int(location):
     *                 return answer
     *         else:
     *             queue.append(pop)
     *
     *     return answer
     */
}
