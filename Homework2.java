package homeworkChapter16;

import java.util.HashSet;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		HashSet<String> namesSet = new HashSet<String>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please, enter the names:");
		String enSentence = scanner.nextLine();

		String[] names = enSentence.split(" ");
		System.out.printf("Number of elements: %d\nThe names are:\n", names.length);

		for (String name : names)
			namesSet.add(name);

		for (String print : namesSet) {
			System.out.print("\nname - " + print + "\n");

			int count = 0, length = 0;
			do {
				char name[] = print.toCharArray();
				length = name.length;
				count = 0;
				for (int j = 0; j < length; j++) {
					if (name[0] == name[j])
						count++;
				}
				if (count != 0)
					System.out.printf("Character %c repeats %d times;\n", name[0], count);
				print = print.replace("" + name[0], "");
			} while (length != 1);
		}
		scanner.close();
	}
}

//16.14 (Counting Letters) Modify the program of Fig. 16.18 to count the number of occurrences
//of each letter rather than of each word. For example, the string "HELLO THERE" contains two Hs, three
//Es, two Ls, one O, one T and one R. Display the results.