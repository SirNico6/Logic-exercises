package logic;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatedCharacters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Write a word or phrase to count the repeated characters.");
		String text = scan.nextLine().toLowerCase();
		char[] chars = text.toCharArray();
		int count = 0;
		int repeated = 0;
		ArrayList<Character> repeatedChars = new ArrayList<Character>();

		while (count < chars.length) {

			char c = chars[count];

			for (int i = 0; i < chars.length; i++) {
				if (c == chars[i]) {
					repeated++;
				}
			}
			repeated--;
			if (!repeatedChars.contains(c) && repeated != 0 && c != ' ') {
				if (repeated == 1)
					System.out.println("the character: " + c + " is repeated: " + repeated + " time ");
				else
					System.out.println("the character: " + c + " is repeated: " + repeated + " times ");
				repeatedChars.add(c);
			}
			repeated = 0;
			count++;
		}
		scan.close();
	}
}