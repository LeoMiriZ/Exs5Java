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
	
	System.out.println("A soma dos valores é "+ dado3);
	
	dado3= dado1 - dado2;
	
	System.out.println("A subtração dos valores é " + dado3);
	
	dado3= dado1 * dado2;
	
	System.out.println("A multplicação dos valores é " + dado3);
	
	dado3 = dado1 % dado2;
	
	System.out.println("O resto dos valores é " + dado3);
	
	double resultado2;
	
	resultado2 = (double)dado1 / dado2;
	
	System.out.println("A divisão dos valores é " + resultado2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
