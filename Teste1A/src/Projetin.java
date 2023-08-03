import java.util.Scanner;

public class Projetin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
	
	double z, x, y, w, q, u;
	
	System.out.println("x--> ");
	x = teclado.nextDouble();
	
	System.out.println("y--> ");
	y = teclado.nextDouble();
	
	System.out.println("w--> ");
	w = teclado.nextDouble();
	
	System.out.println("q--> ");
	q = teclado.nextDouble();
	
	System.out.println("u--> ");
	u = teclado.nextDouble();
	
	z = (x + y) / (u + w / q);
	
	System.out.println("z = " + z);
	
	
	
	
	}

}
