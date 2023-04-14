package programmers.lv0;

public class PaperCutting {
    public int solution(int M, int N) {
        int a = M - 1;
        int b = (N - 1) * M;
        return a + b;
    }
}
