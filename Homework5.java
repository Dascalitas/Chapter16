package homeworkChapter16;

import java.util.Comparator;
import java.util.PriorityQueue;

class ComparatorD implements Comparator<Double> {

	@Override
	public int compare(Double o1, Double o2) {
		if (o1 < o2)
			return 1;
		else if (o1 > o2)
			return -1;
		return 0;
	}
}

public class Homework5 {
	public static void main(String[] args) {
		PriorityQueue<Double> queue = new PriorityQueue<>(3, new ComparatorD());
		queue.offer(3.2);
		queue.offer(9.8);
		queue.offer(5.4);

		System.out.print("Polling from queue: ");

		queue.comparator();

		while (queue.size() > 0) {
			System.out.printf("%.1f ", queue.peek());
			queue.poll();
		}
	}
}

//16.21 (Changing a PriorityQueue’s Sort Order) The output of Fig. 16.15 shows 
//that PriorityQueue orders Double elements in ascending order.  Rewrite Fig. 
//16.15 so that it orders Double elements in descending order (i.e., 9.8 should be the highest-priority element rather than 3.2).