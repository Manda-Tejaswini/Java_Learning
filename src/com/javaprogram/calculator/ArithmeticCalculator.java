package com.javaprogram.calculator;

import java.util.Scanner;

public class ArithmeticCalculator {
	public static void main(String[] args) {

		System.out.println("Enter first and second number:");
		Scanner inp = new Scanner(System.in);
		double num1, num2;
		num1 = inp.nextDouble();
		num2 = inp.nextDouble();
		
		System.out.println(
				"Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
		//char choose = inp.next().charAt(0);
		int choose;
		choose = inp.nextInt();
		
		switch (choose) {
		case 1:
			System.out.println(add(num1, num2));
			break;
		case 2:
			System.out.println(sub(num1, num2));
			break;
		case 3:
			System.out.println(mult(num1, num2));
			break;
		case 4:
			System.out.println(div(num1, num2));
			break;
		default:
			System.out.println("Illegal Operation");

		}
		
		inp.close();
	}

	public static double add(double x, double y) {
		double result = x + y;
		return result;
	}

	public static double sub(double x, double y) {
		double result = x - y;
		return result;
	}

	public static double mult(double x, double y) {
		double result = x * y;
		return result;
	}

	public static double div(double x, double y) {
		double result = x / y;
		return result;
	}

}