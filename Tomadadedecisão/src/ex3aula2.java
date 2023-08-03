import java.util.Scanner;

public class ex3aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner teclado = new Scanner (System.in);
	
double y, x;

System.out.println("Insira o valor de x--> ");
x = teclado.nextDouble();


y = ((x - 8)) / (Math.sqrt(x * x - (25)));

System.out.println("O valor de y é " + y);


if (x>5 || x<-5) {
	
	System.out.println("Válido");
} else {
	
	System.out.println("Inválido");
}
	
	
	
	teclado.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
