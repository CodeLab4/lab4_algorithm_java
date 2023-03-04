package programmers;

public class Cola_roy {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int n = 10;
        int answer = 0;

        while (n >= a) {
            int temp = 0;
            if (n % a != 0) {
                temp += n % a;
            }

            n = n / a;
            n *= b;
            answer += n;
            n += temp;
        }

        System.out.println(answer);
    }
}
