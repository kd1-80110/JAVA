package com.sunbeam;

import java.util.Scanner;

public class Calculate {

	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {
		double num1 = 20, num2 = 10;
		int choice;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("*****************************:");
			System.out.println("0. Exit");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Good Bye...");
				break;
			case 1:
				calculate(num1, num2, (a, b) -> a + b);
				break;
			case 2:
				calculate(num1, num2, (a, b) -> a - b);
				break;
			case 3:
				calculate(num1, num2, (a, b) -> a * b);
				break;
			case 4:
				if (num2 != 0) {
					calculate(num1, num2, (a, b) -> a / b);
				} else {
					System.out.println("Division by zero is not allowed.");
				}
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 0);
	}

}
