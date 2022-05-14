package teste;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dominio.Plano;

public class TestePlano {
	@Test
	public void TestarDistancia() {
		Plano plano = new Plano(5f, 2f, 10f, 4f);
		assertEquals(5.3851647f, plano.calculaDistancia(), 0);
	}
}

