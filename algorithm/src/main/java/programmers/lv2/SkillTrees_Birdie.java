package programmers.lv2;

public class SkillTrees_Birdie {
    /**
     * def solution(skill, skill_trees):
     *     answer = 0
     *
     *     tmp = list(skill)
     *
     *     for i in skill_trees:
     *         allow_skill_index = 0
     *         error = 0
     *         my_skill = list(i)
     *
     *         for j in my_skill:
     *             if j not in tmp:
     *                 continue
     *             if j == tmp[allow_skill_index]:
     *                 allow_skill_index += 1
     *                 continue
     *             if j != tmp[allow_skill_index]:
     *                 error += 1
     *                 break
     *
     *         if error == 0:
     *                 answer += 1
     *
     *     return answer
     */
}
