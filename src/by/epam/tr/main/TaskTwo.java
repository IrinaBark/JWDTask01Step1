package by.epam.tr.main;

public class TaskTwo {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		a = 5;
		b = -10;
		c = -4;
		
		double disc;
		double result;
		
		disc = Math.sqrt(Math.pow(b, 2) + 4 * a * c);
		
		result = (b + disc) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, 2);
		
		System.out.printf("%4.2f", result);
	}
}
