package baekjoon.silver.silver2;

public class B1182_Birdie {
    /**
     * 처음에 permutation으로 문제를 풀었더니, 순열의 순서가 바뀌어도 중복으로 정답처리 되는 부분 발생
     * combinations로 바꿔서 중복 해결
     *
     * from itertools import combinations
     *
     * numbers, total = map(int, input().split())
     *
     * number_list = list(map(int, input().split()))
     *
     * answer = 0
     *
     * for i in range(1, len(number_list) + 1):
     *     for j in combinations(number_list, i):
     *         if sum(j) == total:
     *             answer += 1
     *
     * print(answer)
     */
}
