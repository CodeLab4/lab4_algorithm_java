package programmers.lv1;

public class SecretBetween_Core {
	public static void main(String[] args) {
		System.out.println(solution("ybcde", "az", 1));
	}

	public static String solution(String s, String skip, int index) {
		StringBuilder sb = new StringBuilder();
		char[] chars = s.toCharArray();

		int[] skipAsciis = new int[skip.length()];
		for (int i = 0; i < skip.length(); i++) {
			skipAsciis[i] = skip.charAt(i);
		}

		for (char ch : chars) {
			for (int i = 0; i < index; i++) {
				ch++;

				if (ch > 'z') {
					ch = 'a';
				}

				for (int j = 0; j < skipAsciis.length; ) {
					if (ch == skipAsciis[j]) {
						ch++;

						if (ch > 'z') {
							ch = 'a';
						}

						j = 0;
						continue;
					}
					j++;
				}
			}
			sb.append(ch);
		}

		return sb.toString();
	}
}
