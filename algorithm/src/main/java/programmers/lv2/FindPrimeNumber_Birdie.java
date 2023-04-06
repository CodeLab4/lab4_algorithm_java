package programmers.lv2;

public class FindPrimeNumber_Birdie {
    /**
     * from itertools import permutations
     *
     * def solution(numbers):
     *     answer = 0
     *     list = []
     *
     *     for i in range(1, len(numbers) + 1):
     *         for j in permutations(numbers, i):
     *             list.append(j)
     *
     *     number_list = []
     *
     *     for i in list:
     *         tmp = ''
     *         for j in i:
     *             tmp += j
     *         if int(tmp) not in number_list and int(tmp) != 0:
     *             number_list.append(int(tmp))
     *
     *     for i in number_list:
     *         if is_prime(i):
     *             answer += 1
     *
     *     return answer
     *
     * def is_prime(n):
     *     if n < 2:
     *         return False
     *     for i in range(2, int(n ** 0.5) + 1):
     *         if n % i == 0:
     *             return False
     *     return True
     */
}
