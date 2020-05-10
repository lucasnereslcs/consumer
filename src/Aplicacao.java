import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Produto> produtos = new ArrayList<>();

		produtos.add(new Produto("Tv", 1200.00));
		produtos.add(new Produto("Celular", 800.00));
		produtos.add(new Produto("Radio", 980.00));

		produtos.forEach(Update::accept);
		produtos.forEach(System.out::println);

	}

}
