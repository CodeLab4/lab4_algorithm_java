package z.programmers.lv2;

public class FunctionDevelop_Birdie {
    /**
     * def solution(progresses, speeds):
     *     answer = []
     *     total_len = len(progresses)
     *     index = 0
     *     finished = [False] * total_len
     *
     *     while not all(finished):
     *         count = 0
     *         for i in range(len(progresses)):
     *             progresses[i] += speeds[i]
     *             if progresses[i] >= 100:
     *                 finished[i] = True
     *
     *         for i in range(len(finished)):
     *             if finished[index]:
     *                 count += 1
     *                 index += 1
     *                 if index >= total_len:
     *                     break
     *
     *         if count != 0:
     *             answer.append(count)
     *
     *     return answer
     *
     * progresses = [93, 30, 55]
     * speeds = [1, 30, 5]
     *
     * print(solution(progresses, speeds))
     */
}
