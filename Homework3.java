package homeworkChapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please, enter the sentence:");
		String enSentence = scanner.nextLine();

		String[] nameL = enSentence.split(" ");
		System.out.printf("Number of elements: %d\nThe elements are:\n", nameL.length);
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(nameL));

		String word = null;

		do {

			int count = 0;

			for (int j = 0; j < names.size(); j++) {

				word = names.get(0);
				if (word.equals(names.get(j))) {
					count++;
				}
			}
			if (count != 0)
				System.out.printf("element %s repeats %d times;\n", names.get(0), count);

			while (names.contains(word)) {
				names.remove(word);
			}
		} while (names.size() != 1);

		scanner.close();
	}

}

//16.16 (Counting Duplicate Words) Write a program that determines and prints the number of
//duplicate words in a sentence. Treat uppercase and lowercase letters the same. Ignore punctuation.