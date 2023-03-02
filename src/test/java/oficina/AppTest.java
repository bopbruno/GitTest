package oficina;

import org.junit.Test;

public class AppTest {

	@Test
	public void deveriaRetornarBruno() {
		String nome = new App().getNome();
		assert(nome.equals("Bruno"));
	}

}
