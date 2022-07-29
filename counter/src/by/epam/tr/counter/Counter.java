package by.epam.tr.counter;

import java.util.Objects;

/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать 
 * свое значение на единицу в заданном диапазоне. Предусмотритеинициализацию счетчика 
 * значениями по умолчанию и произвольными значениями.Счетчик имеет методы увеличения 
 * и уменьшения состояния, и метод позволяющееполучить его текущее состояние.
 * Написать код, демонстрирующий все возможности класса.*/

public class Counter {

	private long counter;
	private boolean status;
	private long lowLimit;
	private long upperLimit = 100;

	public Counter() {
	}

	public Counter(long lowLimit, long upperLimit) {
		this.counter = lowLimit;
		this.lowLimit = lowLimit;
		this.upperLimit = upperLimit;
	}

	public Counter(long lowLimit, long upperLimit, long current) {
		this.lowLimit = lowLimit;
		this.upperLimit = upperLimit;
		counter = current;
		if (counter < lowLimit) {
			counter = lowLimit;
		}
	}

	public boolean getStatus() {
		return status;
	}

	public long getCounter() {
		return counter;
	}

//	public void setCounter(long counter) {
//		this.counter = counter;
//	}

	public long getLowLimit() {
		return lowLimit;
	}

	public long getUpperLimit() {
		return upperLimit;
	}

	public void increase() {
		status = true;
		if (counter < upperLimit) {
			counter++;
		} else {
			status = false;
			CounterView view = new CounterView();
			view.printLimit(this);
		}
	}

	public void decrease() {
		status = true;
		if (counter > lowLimit) {
			counter--;
		} else {
			status = false;
			CounterView view = new CounterView();
			view.printLimit(this);
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(counter, lowLimit, status, upperLimit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		return counter == other.counter && lowLimit == other.lowLimit && status == other.status
				&& upperLimit == other.upperLimit;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [counter=" + counter + ", status=" + status + ", lowLimit=" + lowLimit
				+ ", upperLimit=" + upperLimit + "]";
	}

}
