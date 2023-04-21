package z_legacy.programmers.lv2;

public class DiscountEvent_Birdie {
    /**
     * def solution(want, number, discount):
     *     answer = 0
     *     total_count = 0
     *     # 슬라이싱을 위한 number의 합 구하기
     *     for i in number:
     *         total_count += i
     *     # 리스트 슬라이싱 하면서 몇개를 포함하는지 구하기
     *     for i in range(0, len(discount) - total_count + 1):
     *         discount_list = discount[i: i + total_count]
     *         tmp = 0
     *         for j in range(0, len(number)):
     *             # 슬라이싱 한 리스트 내에서 요소들의 개수가 맞으면 tmp += 1
     *             if discount_list.count(want[j]) == number[j]:
     *                tmp += 1
     *         # tmp == 요구사항 맞으면 정답 += 1
     *         if tmp == len(want):
     *             answer+= 1
     *     return answer
     */
}
