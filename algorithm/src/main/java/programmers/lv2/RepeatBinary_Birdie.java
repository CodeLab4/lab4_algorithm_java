package programmers.lv2;

public class RepeatBinary_Birdie {
    /**
     * def solution(s):
     *     answer = []
     *     delete_zero = 0
     *     binary_change = 0
     *
     *     while len(s) != 1:
     *         delete_zero += s.count('0')
     *         binary_change += 1
     *
     *         s = s.replace('0', '')
     *         tmp = len(s)
     *         s = str(bin(tmp)[2:])
     *
     *     answer.append(binary_change)
     *     answer.append(delete_zero)
     *
     *     return answer
     */
}
