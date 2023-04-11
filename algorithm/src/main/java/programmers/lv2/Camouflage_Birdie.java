package programmers.lv2;

public class Camouflage_Birdie {
    /**
     * from collections import defaultdict
     *
     * def solution(clothes):
     *     answer = 1
     *     multivalue_map = defaultdict(list)
     *
     *     for i in clothes:
     *         # i[0] == 옷,  i[1] == 종류
     *         multivalue_map[i[1]].append(i[0])
     *
     *     # 안입는 경우의 수 고려
     *     for i in multivalue_map:
     *         answer *= (len(multivalue_map[i]) + 1)
     *
     *     # 모든 위장을 안입는 경우는 없으니 1을 빼준다.
     *     return answer - 1
     *
     * clothes = [["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]
     *
     * print(solution(clothes))
     */
}
