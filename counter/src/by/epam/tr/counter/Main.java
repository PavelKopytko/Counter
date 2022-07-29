package by.epam.tr.counter;

public class Main {

	public static void main(String[] args) {

		CounterView view = new CounterView();

		Counter count1 = new Counter(10, 14);
		int n = 10;
		while (n < 15) {
			n++;
			count1.increase();
			view.print(count1);
		}

		Counter count2 = new Counter(95, 96, 94);
		view.print(count2);

		count2.decrease();
		view.print(count2);

		count2.increase();
		view.print(count2);

		count2.increase();
		view.print(count2);

		count2.increase();
		view.print(count2);

	}

}
