package lab4;

public class Program {

	public static void main(String[] args) {
		
		int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8};
		
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		System.out.println("Sum: " + sum);
	
	double average = (double) sum / numbers.length;
	System.out.println("Average: " + average); 
	
	int min = numbers [0];
	int max = numbers [0];
	for (int num : numbers) {
		if (num < min) {
			min = num;
		}
		if (num > max) {
			max = num;
			}
	}
			System.out.println("Minimum: " + min);
			System.out.println("Maximum: " + max);
	
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				System.out.println("Index of 0: " + i);
				break;
			}
		}
		
		String[] students = { "Alice", "Bob", "Charlie", "Diana", "Ethan" };
		int[] marks = { 45, 58, 65, 82, 91 };

		for (int i = 0; i < students.length; i++) {
		    String grade = getGrade(marks[i]);
		    System.out.println(students[i] + " scored " + marks[i] + " -> " + grade);
		}
		
		double initialMoney = 100.0;
		double currentMoney = initialMoney;
		double interestRate = 0.05; // 5%
		int years = 0;

		while (currentMoney < 200.0) {
			currentMoney += currentMoney * interestRate; // or currentMoney *= 1.05;
			years++;
		}

		System.out.println("It takes " + years + " years to double your money (Final balance: £" + String.format("%.2f", currentMoney) + ")");
		System.out.println("\nMultiplication Table:");
		
		for (int row = 1; row <= 10; row++) {
		    for (int col = 1; col <= 10; col++) {
		        System.out.printf("%4d", row * col);
		    }
		    System.out.println();
		}
		
	}	
	
	public static String getGrade(int mark) {
		if (mark < 1 || mark > 100) {
			return "Error: marks must be between 1..100";
		} else if (mark < 50) {
			return "Fail";
		} else if (mark <= 60) {
			return "Pass";
		} else if (mark <= 70) {
			return "Merit";
		} else {
			return "Distinction";
		}
		
	}
}
