package teste;

import org.junit.Assert;
import org.junit.Test;

import dominio.Amostra;

public class TesteAmostra {
	@Test
	public void GrauDeveriaSer10(){
		Amostra amostra = new Amostra(1, 5, 60, 90000);
		int grau = amostra.informaGrau();
		Assert.assertEquals(grau, 10);
	}
	@Test
	public void GrauDeveriaSer9(){
		Amostra amostra = new Amostra(1, 5, 60,70000);
		int grau = amostra.informaGrau();
		Assert.assertEquals(grau, 9);
	}
	@Test
	public void GrauDeveriaSer8(){
		Amostra amostra = new Amostra(1, 5, 40, 70000);
		int grau = amostra.informaGrau();
		Assert.assertEquals(grau, 8);
	}
	@Test
	public void GrauDeveriaSer7(){
		Amostra amostra = new Amostra(1, 15, 60, 90000);
		int grau = amostra.informaGrau();
		Assert.assertEquals(grau, 7);
	}
}
