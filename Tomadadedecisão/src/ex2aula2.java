import java.util.Scanner;

public class ex2aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
double x1, x2, y1, y2, distancia1, distancia2;


System.out.println("Insira o primero valor de x ");
x1 = teclado.nextDouble();

System.out.println("Insira o segundo valor de x ");
x2 = teclado.nextDouble();

System.out.println("Insira o primero valor de y ");
y1 = teclado.nextDouble();

System.out.println("Insira o segundo valor de y ");
y2 = teclado.nextDouble();


distancia1 = (Math.sqrt((x1 * x1) + (y1 * y1)));

System.out.println("A distância 1 é " + distancia1);

distancia2 = (Math.sqrt((x2 * x2) + (y2 * y2)));

System.out.println("A distância 2 é " + distancia2);

if (distancia1<distancia2) {
	
	System.out.println("A menor distância até a origem é do ponto A");
} else {
	
	System.out.println("A menor distância até a origem é do ponto B");
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
