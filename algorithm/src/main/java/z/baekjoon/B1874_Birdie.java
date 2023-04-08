package z.baekjoon;

public class B1874_Birdie {
    /**
     * number = int(input())
     * stack = []
     * flag = 0
     * answer = []
     * current_number = 1
     * for i in range(number):
     *     required = int(input())
     *     while current_number <= required:
     *         stack.append(current_number)
     *         answer.append("+")
     *         current_number += 1
     *
     *     if stack[-1] == required:
     *         stack.pop()
     *         answer.append("-")
     *     else:
     *         print("NO")
     *         flag = 1
     *         break
     *
     * if flag == 0:
     *     for i in answer:
     *         print(i)
     */
}
