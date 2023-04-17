package programmers.lv2;

public class MaximizeFormula_Birdie {
    /**
     * from itertools import permutations
     *
     * def operation(num1, num2, operation):
     *     if operation == '+':
     *         return str(int(num1) + int(num2))
     *     if operation == '-':
     *         return str(int(num1) - int(num2))
     *     if operation == '*':
     *         return str(int(num1) * int(num2))
     *
     * def calculate(exp,op):
     *     array=[]
     *     tmp=""
     *     for i in exp:
     *         if i.isdigit()==True:
     *             tmp+=i
     *         else:
     *             array.append(tmp)
     *             array.append(i)
     *             tmp=""
     *     array.append(tmp)
     *
     *     for o in operation:
     *         stack=[]
     *         while len(array)!=0:
     *             tmp=array.pop(0)
     *             if tmp==o:
     *                 stack.append(operation(stack.pop(), array.pop(0), o))
     *             else:
     *                 stack.append(tmp)
     *         array=stack
     *
     *     return abs(int(array[0]))
     *
     * def solution(expression):
     *     operation = ['+', '-', '*']
     *     operation = list(permutations(operation, 3))
     *     result=[]
     *     for i in operation:
     *         result.append(calculate(expression, i))
     *     return max(result)
     */
}
