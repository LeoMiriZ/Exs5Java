import java.util.Map;
import java.util.TreeMap;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> tree = new TreeMap<>();

		tree.put(125, "Maria");
		tree.put(75, "José");
		tree.put(38, "Wagner");
		tree.put(170, "João");

		// System.out.println(tree);

		for (Map.Entry<Integer, String> lista : tree.entrySet()) {

			System.out.println(lista.getKey());
			System.out.println(lista.getValue());
			System.out.println();

		}

	}

}
