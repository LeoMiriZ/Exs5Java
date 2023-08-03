import java.util.Scanner;

public class desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	
	
	Scanner teclado = new Scanner (System.in);
	
	
	double nota1, nota2, resultado;
	
	System.out.println("Insira a primeira nota--> ");
	nota1 = teclado.nextDouble();
	
	
	System.out.println("Insira a segunda nota--> ");
	nota2 = teclado.nextDouble();
	
	
	resultado = (nota1 + nota2) / 2;
	
	System.out.println("A média das notas é " + resultado);
	
	if (resultado>=7) {
		
		System.out.println("Aprovado");
	}
	
	else {
		
		System.out.println("Reprovado");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
