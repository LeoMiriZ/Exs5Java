import java.util.Scanner;

public class Projetinc {

	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		double x, b, a, c;
		
		
		
		System.out.println("a--> ");
		a = teclado.nextDouble();
		
		System.out.println("b--> ");
		b = teclado.nextDouble();
		
		System.out.println("c--> ");
		c = teclado.nextDouble();
		
		x = (-b + Math.sqrt(b*b - 4 * a * c)) / (2 * a);

	
		System.out.println("x--> " + x);
		
		
		
		
		
		
		
		
	}
}
