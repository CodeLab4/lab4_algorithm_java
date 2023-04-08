package z.programmers;

public class FruitSeller_Birdie {
}

/**
 * def solution(k, m, score): answer = 0 score = sorted(score, reverse=True)
 * <p>
 * for i in range(0, len(score), m): tmp = score[i:i + m]
 * <p>
 * if len(tmp) == m: answer += min(tmp) * m
 * <p>
 * return answer
 */
