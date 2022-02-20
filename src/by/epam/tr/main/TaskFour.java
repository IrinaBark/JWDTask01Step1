package by.epam.tr.main;

import java.util.Scanner;

public class TaskFour {

	public static void main(String[] args) {
		
		boolean result;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the x-coordinate(integer) >");
		
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Enter the x-coordinate(integer) >");
		}
		int x = sc.nextInt();
		
		System.out.print("Enter the y-coordinate(integer) >");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Enter the y-coordinate(integer) >");
		}
		int y = sc.nextInt();
		
		boolean area1x = (x >= -2) && (x <= 2);
		boolean area1y = (y >= 0) && (y <= 4);
		
		boolean area2x = (x >= -4) && (x <= 4);
		boolean area2y = (y >= -3) && (y <= 0);
		
		result = area1x && area1y || area2x && area2y;
	
			System.out.println(result);
	}

}
