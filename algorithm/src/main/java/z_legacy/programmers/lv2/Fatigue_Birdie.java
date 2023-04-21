package z_legacy.programmers.lv2;

public class Fatigue_Birdie {
    /**
     * from itertools import permutations
     *
     * def solution(k, dungeons):
     *     answer = 0
     *      # 순열 사용
     *     for p in permutations(dungeons, len(dungeons)):
     *         tmp = k
     *         count = 0
     *          # 남은 피로도보다 요구하는 피로도가 크거나 같은 경우 진행하기
     *         for need, spend in p:
     *             if tmp >= need:
     *                 tmp -= spend
     *                 count += 1
     *          # count 와 정답 중 큰 수를 리턴
     *         answer = max(answer, count)
     *     return answer
     */
}
