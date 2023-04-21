package z_legacy.programmers;

public class NumberMate_roy {
    public static void main(String[] args) {
        String X = "5525";
        String Y = "1255";

        String answer = "";

        int[] xNumbers = new int[10];
        int[] yNumbers = new int[10];

        for (String s : X.split("")) {
            xNumbers[Integer.parseInt(s)]++;
        }

        for (String s : Y.split("")) {
            yNumbers[Integer.parseInt(s)]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int min = Math.min(xNumbers[i], yNumbers[i]);
            int cnt = 0;
            while (min > 0 && cnt < min) {
                sb.append(i);
                cnt++;
            }
        }
        answer = sb.toString();
        if (answer.equals("")) {
            answer = "-1";
        }
        if (answer.startsWith("0")) {
            answer = "0";
        }
        System.out.println(answer);
    }
}
