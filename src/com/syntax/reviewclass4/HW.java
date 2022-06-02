package com.syntax.reviewclass4;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double accumulatedAmount = 0;
		double amountToPayOff;

		do {
			System.out.println("Enter item name that you want to buy");
			String itemName = input.next();
			System.out.println("What is the item price of that item");
			double itemPrice = input.nextDouble();
			accumulatedAmount = accumulatedAmount + itemPrice;
			System.out.println("Please Enter the money");
			double money = input.nextDouble();
			amountToPayOff = money - accumulatedAmount;
			if (amountToPayOff < 0) {
				System.out.println("Amount to pay off");
				break;
			}

		} while (amountToPayOff < 0);
		System.out.println("Here is your change" + amountToPayOff + " Thank you for shopping!");

	}

}
