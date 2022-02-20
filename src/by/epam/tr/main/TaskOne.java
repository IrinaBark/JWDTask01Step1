package by.epam.tr.main;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int number = 0;
		int sum = 0;
		int sum1;

		System.out.print(" Enter a four-digit number >");

		for (;;) {
			if (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("You've entered something else. \nPlease, enter a four-digit number >");
			} else if ((number = sc.nextInt()) > 9999 || number < 1000) {
				System.out.print("Please, enter a four-digit number>");
				sc.nextLine();
			} else
				break;
		}

		for (int i = 0; i < 2; i++) {
			sum += number % 10;
			number /= 10;
		}

		sum1 = number / 10 + number % 10;

		System.out.println(sum == sum1);

	}

}
       