package z.programmers;

public class MakingStrangeCharacters_roy {
    public static void main(String[] args) {
        String s = "try hello world";
        String answer = "";

        StringBuilder stringBuilder = new StringBuilder();
        s = s.toLowerCase();
        String[] stringToken = s.split("");

        int flag = 0;
        for (int i = 0; i < stringToken.length; i++) {
            if (stringToken[i].equals(" ")) {
                flag = 0;
                stringBuilder.append(" ");
                continue;
            }

            if (flag % 2 == 0) {
                stringBuilder.append(stringToken[i].toUpperCase());
                flag++;
                continue;
            }
            stringBuilder.append(stringToken[i]);
            flag++;
        }

        answer = stringBuilder.toString();
        System.out.println(answer);
    }
}
