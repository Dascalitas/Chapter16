package homeworkChapter16;

import java.util.HashSet;
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		HashSet<String> namesSet = new HashSet<String>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please, enter the names:");
		String enSentence = scanner.nextLine();

		String[] names = enSentence.split(" ");
		System.out.printf("Number of elements: %d\nThe names are:\n", names.length);

		for (String name : names) 
			namesSet.add(name);

		for (String print : namesSet)
			System.out.println("name - " + print);
		
		scanner.close();
	}

}

//16.13 (Duplicate Elimination) Write a program that reads in a series of first names and eliminates
//duplicates by storing them in a Set. Allow the user to search for a first name.