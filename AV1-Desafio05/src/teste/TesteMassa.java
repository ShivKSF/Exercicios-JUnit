package teste;

import org.junit.Assert;
import org.junit.Test;

import dominio.Massa;

public class TesteMassa {
	@Test
	public void DeveriaRetornarTempoCerto(){
		Massa testemassa = new Massa(10);
		testemassa.calculaTempo();
		int x = testemassa.getTempo();
		Assert.assertEquals(250, x, 0);
	}
}
