package programmers.lv1;

public class Babbling_2_roy {
	public static void main(String[] args) {
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		int answer = 0;

		String[] arr = {"aya", "ye", "woo", "ma"};

		for (int i = 0; i < babbling.length; i++) {
			String temp = babbling[i];
			String lastWord = "";
			for (int j = 0; j < arr.length; j++) {
				if (!arr[j].equals(lastWord) && temp.startsWith(arr[j])) {
					temp = temp.substring(arr[j].length());
					lastWord = arr[j];
					j = -1;
				}
			}
			if (temp.equals("")) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
