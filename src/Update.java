import java.util.function.Consumer;

public class Update implements Consumer {

	@Overload
	public static void accept(Produto p) {

		p.setPreco(p.getPreco() * 1.1);

	}

	@Override
	public void accept(Object t) {
		// TODO Auto-generated method stub

	}

}
