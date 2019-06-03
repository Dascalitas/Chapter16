package homeworkChapter16;

import java.util.LinkedList;

public class Homework4 {

	public static void main(String[] args) {
		LinkedList<Integer> objects = new LinkedList<Integer>();
		LinkedList<Integer> objectsNew = new LinkedList<Integer>();

		objects.add(1); objects.add(2); objects.add(3); objects.add(4); objects.add(5);
		objects.add(6); objects.add(7); objects.add(8); objects.add(9); objects.add(10);

		while (!objects.isEmpty()) {
			objectsNew.add(objects.getLast());
			objects.removeLast();
		}
		System.out.println(objectsNew);
	}

}

//16.18 (Copying and Reversing LinkedLists) Write a program that creates a LinkedList object of
//10 characters, then creates a second LinkedList object containing a copy of the first list, but in reverse order. 