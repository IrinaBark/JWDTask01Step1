package by.epam.tr.main;

public class TaskThree {

	public static void main(String[] args) {

		int a;
		int b;
		int hyp;
		int p;
		double s;
		
		a = 23;
		b = 12;
		
		hyp = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

		p = a + b + hyp;
		s = 0.5 * (a * b);

		System.out.println("Perimeter - " + p + ", square of triangle - " + s);
		
	}

}
