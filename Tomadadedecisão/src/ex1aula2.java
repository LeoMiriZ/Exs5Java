import java.util.Scanner;

public class ex1aula2 {

public static void main(String[] args) {

	
Scanner teclado = new Scanner(System.in);

double nota1, nota2, nota3, nota4, resultado;


System.out.println("Insira a primeira nota--> ");
nota1 = teclado.nextDouble();

System.out.println("Insira a segunda nota--> ");
nota2 = teclado.nextDouble();

System.out.println("Insira a terceira nota--> ");
nota3 = teclado.nextDouble();

System.out.println("Insira a quarta nota--> ");
nota4 = teclado.nextDouble();

resultado = ((nota1 + nota2) / (2) * (0.7) + (nota3 + nota4) / (2) * (0.3));

System.out.println("A média do aluno é " + resultado);

if (resultado >= 7) { 
	
	System.out.println("Aprovado");
}

else { 
	
	System.out.println("Reprovado");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






















}
