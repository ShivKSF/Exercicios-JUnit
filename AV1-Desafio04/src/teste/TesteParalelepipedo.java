package teste;

import org.junit.Assert;
import org.junit.Test;

import dominio.Paralelepipedo;

public class TesteParalelepipedo {
	@Test
	public void DeveriaRetornarDiagonalCerta(){
		Paralelepipedo para = new Paralelepipedo(2f, 4f, 6f);
		float x = para.calculaDiagonal();
		Assert.assertEquals(x, 7.483315f, 0);
	}
}
