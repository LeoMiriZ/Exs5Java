
public class Vinho {

	private String nome;
	private int safra;

	public Vinho(String nome, int safra) {

		this.nome = nome;
		this.safra = safra;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return nome + "\n" + safra + "\n";

	}

}
