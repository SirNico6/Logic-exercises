package logic;

import java.util.Scanner;

public class WordInvestor {

	public static void main(String[] args) {

		String text = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write a word or phrase to invest");
		text = scan.nextLine();
		
		int length = text.length() - 1;
		
		for (int i = 0; i < text.length(); i++) {
			char letra = text.charAt(length);
			System.out.print(letra);
			length--;
		}
		scan.close();
	}
}
