import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Vinho> adega = new Stack<>();
		
		Stack<Vinho> aux = new Stack<>();


		adega.push(new Vinho("a", 1993));
		adega.push(new Vinho("b", 1996));
		adega.push(new Vinho("c", 2001));
		adega.push(new Vinho("d", 2008));
		adega.push(new Vinho("e", 2014));
		adega.push(new Vinho("f", 2016));
		adega.push(new Vinho("g", 2019));
		
		System.out.println("Vinho para abrir em uma ocasião especial: ");

		System.out.println(adega.peek());
		
		System.out.println();
		
		System.out.println("Vinhos mais antigos: ");
		
		while(adega.size() > 5) {
			
			aux.push(adega.pop());
			
		}
				
		while(!adega.empty()) {
			
			System.out.println(adega.peek());
			aux.push(adega.pop());
			
		}
		
		while(!aux.empty()) {
			
			adega.push(aux.pop());
			
		}
		
	}

}
