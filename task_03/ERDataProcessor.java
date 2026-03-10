package task_03;
public class ERDataProcessor {
	private double[] data = null; // stores a list of exchange rates, initialised as null
	private double averageRate = 0; // stores the average pound dollar exchange rate, initialised to 0
	public void process(String data) { // takes a string of numbers with \r breaks and converts it into a list of doubles, which is then stored in data, and finds the average of the numbers, which is stored in averageRate
		String[] dataArray = data.split("\r");
		double[] doubleArray = new double[dataArray.length];
		double total = 0;
		for (int x = 0; x < dataArray.length; x++) {
			if (dataArray[x] == "") { // checks if there is an empty string to prevent errors
				continue;
			}
			double d = Double.parseDouble(dataArray[x]);
			doubleArray[x] = d;
			total += d;
		}
		this.data = doubleArray;
		this.averageRate = total / dataArray.length;
	}
	public double poundToDollar(double p) { // converts an amount in pounds to dollars using the currently stored exchange rate
		double d = p * this.averageRate;
		return d;
	}
	public double dollarToPound(double d) { // converts an amount in dollars to pounds using the currently stored exchange rate
		double p = d / this.averageRate;
		return p;
	}
	public double[] getData() { // returns the contents of the data attribute
		return this.data;
	}
	public void setData(double[] data) { // sets the data attribute to the contents of data
		this.data = data;
	}
	public double getAverageRate() { // returns the averageRate attribute
		return this.averageRate;
	}
	public void setAverageRate(double averageRate) { // sets the averageRate attribute to whatever is stored in averageRate
		this.averageRate = averageRate;
	}
}