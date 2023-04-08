package z.programmers.lv2;

public class NewsClustering_Birdie {
    /**
     * # 교집합을 합집합 크기로 나눈다.
     * def solution(str1, str2):
     *     answer = 0
     *     first = str1.lower()
     *     second = str2.lower()
     *
     *     first_arr = []
     *     second_arr = []
     *     # 첫 string 에서 자른 후 배열에 넣기
     *     for i in range(0, len(first) - 1):
     *         first_split = first[i: i + 2]
     *         if (first_split.isalpha()):
     *             first_arr.append(first_split)
     *
     *     # 두 번째 string 에서 자른 후 배열에 넣기
     *     for i in range(0, len(second) - 1):
     *         second_split = second[i: i + 2]
     *         if (second_split.isalpha()):
     *             second_arr.append(second_split)
     *
     *     # 나눗셈이 안되면 65536 리턴
     *     if len(first_arr) == 0 and len(second_arr) == 0:
     *         return 65536
     *
     *     # tmp = 임시로 모든 배열 요소 합침 / 집합으로 중복 제거가 됐으면 더 좋을 것 같다.
     *     tmp = first_arr + second_arr
     *     sum_arr = []
     *     # 임시 배열을 돌며, 배열의 요소가 몇 개 있는지 확인하기, 중복되면 더하지 않기, 최대 수 만큼 더하기
     *     for i in tmp:
     *         first_count = first_arr.count(i)
     *         second_count = second_arr.count(i)
     *         if i not in sum_arr:
     *             for _ in range(max(first_count, second_count)):
     *                 sum_arr.append(i)
     *
     *     # 다중 교집합
     *     inter_arr = []
     *     for i in first_arr:
     *         first_count = first_arr.count(i)
     *         second_count = second_arr.count(i)
     *         if i not in inter_arr:
     *             for _ in range(min(first_count, second_count)):
     *                 inter_arr.append(i)
     *
     *     for i in second_arr:
     *         first_count = first_arr.count(i)
     *         second_count = second_arr.count(i)
     *         if i not in inter_arr:
     *             for _ in range(min(first_count, second_count)):
     *                 inter_arr.append(i)
     *
     *     sum_len = len(sum_arr)
     *     inter_len = len(inter_arr)
     *
     *     answer = int((inter_len / sum_len) * 65536)
     *
     *     return answer
     */
}
