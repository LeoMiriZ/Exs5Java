import java.util.Scanner;

public class Testeaula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int dado1, dado2, dado3;
	
	Scanner teclado = new Scanner (System.in);
	
	System.out.println("Por favor, insira o primeiro valor!");
	
	dado1 = teclado.nextInt();
	
	System.out.println("Por favor, insira o segundo valor!");
	
	dado2 = teclado.nextInt();
	
	
	dado3 = dado1 + dado2;
	
	System.out.println("A soma dos valores � "+ dado3);
	
	dado3= dado1 - dado2;
	
	System.out.println("A subtra��o dos valores � " + dado3);
	
	dado3= dado1 * dado2;
	
	System.out.println("A multplica��o dos valores � " + dado3);
	
	dado3 = dado1 % dado2;
	
	System.out.println("O resto dos valores � " + dado3);
	
	double resultado2;
	
	resultado2 = (double)dado1 / dado2;
	
	System.out.println("A divis�o dos valores � " + resultado2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
