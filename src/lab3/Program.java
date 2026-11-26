package lab3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		theLunchQueue();
		//int pounds = getInt("Enter total weight in pounds: ");
		//convertInputToStonesPounds(pounds);
		//int kg = getInt("Enter total weight in kilograms: ");
		//convertKgsToStonesPounds(kg);
	}
	
	public static void theLunchQueue() {
		utils utils = new utils();
		String mainCourse = utils.getString("What main dish would you like(fish, burgers, or veg)?");
		int potatoes = utils.getInt("How many roast potatoes would you like?");
		int sprouts = utils.getInt("How many sprouts would you like?");
		
		System.out.println("Hello, your lunch is " + mainCourse + " with " + potatoes + " roast potatoes and " + sprouts + " Brussel sprouts.");

	}
	
	public static void convertInputToStonesPounds(int pounds) {
		int stones = pounds / 14;
		int remainingPounds = pounds % 14;
		System.out.println(pounds + " lbs is " + stones + " stone and " + remainingPounds + " pounds.");
	}
	
	public static void convertKgsToStonesPounds(int kg) {
		int pounds = (int) (kg * 2.20462);
		convertInputToStonesPounds(pounds);
	}
		
	


}
