package by.epam.tr.counter;

public class CounterView {

	public void printLimit(Counter counter) {
		System.out.println("Counter stoped. Counter value: " + counter.getCounter());

	}

	public void print(Counter counter) {
		System.out.println("Counter value: " + counter.getCounter() + " , low limit: " + counter.getLowLimit()
				+ " , upper limit: " + counter.getUpperLimit());
	}

}
