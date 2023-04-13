package programmers.lv0;

public class AdditionOfFractions_Core {
    public static void main(String[] args) {
        System.out.println(solution(1, 2, 3, 4));
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] result = new int[2];
        int top = numer1 * denom2 + numer2 * denom1;
        int bottom = denom1 * denom2;

        int gcd = gcd(top, bottom);
        result[0] = top / gcd;
        result[1] = bottom / gcd;

        return result;
    }

    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}
