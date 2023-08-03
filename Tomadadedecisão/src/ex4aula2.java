import java.util.Scanner;

public class ex4aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
	int lado1, lado2, lado3, perimetro;
	
	System.out.println("Insira o valor do primeiro lado--> ");
	lado1 = teclado.nextInt();
	
	System.out.println("Insira o valor do segundo lado--> ");
	lado2 = teclado.nextInt();
	
	System.out.println("Insira um valor do terceiro lado--> ");
	lado3 = teclado.nextInt();
	
	perimetro = (lado1 + lado2 + lado3);
	
	System.out.println("O perímetro do triângulo é " + perimetro);
	
	
	if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
		
		System.out.println("É um triângulo");
	} else {
		
		System.out.println("Não é triângulo");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
