package Airport;

public class Airport {

	public static void main(String[] args) {
		double gbp = 200.0;
		int currency = 1;
		char customer = 'R';

		double converted = 0;
		String currencyName = "";
		switch (currency) {
		case 1:
			converted = gbp * 1.25;
			currencyName = "USD";
			break;
		case 2:
			converted = gbp * 1.15;
			currencyName = "EUR";
			break;
		case 3:
			converted = gbp * 180.50;
			currencyName = "JPY";
			break;
		}

		double afterServiceFee;
		if (gbp < 100) {
			afterServiceFee = converted - (converted * 0.05);
		} else {
			afterServiceFee = converted - (converted * 0.025);
		}

		float taxRate = 0.0f;
		if (customer == 'R') {
			taxRate = 0.10f;
		} else if (customer == 'V') {
			taxRate = 0.05f;
		} else if (customer == 'S') {
			taxRate = 0.0f;
		}

		double afterTax = afterServiceFee - (afterServiceFee * taxRate);
		int finalAmount = (int) afterTax;

		System.out.println("Amount after service fee: " + afterServiceFee + " " + currencyName);
		System.out.println("Amount after tax: " + afterTax + " " + currencyName);
		System.out.println("Final amount in foreign currency: " + finalAmount + " " + currencyName);
	}
}