package teste;

import  org.junit.Assert;
import dominio.Forma;
import org.junit.Test;

public class TesteTriangulo {
	@Test
	public void testeTrianguloEquilatero(){
		Forma form = new Forma(4.0f, 4.0f, 4.0f);
		String valor = form.verificaForma();
		Assert.assertEquals(valor, "Triangulo equilatero");
	}
	
	@Test
	public void testeTrianguloIsosceles(){
		Forma form = new Forma(4.0f, 4.0f, 6.0f);
		String valor = form.verificaForma();
		Assert.assertEquals(valor, "Triangulo isosceles");
	}
	
	@Test
	public void testeTrianguloEscaleno(){
		Forma form = new Forma(5.0f, 4.0f, 6.0f);
		String valor = form.verificaForma();
		Assert.assertEquals(valor, "Triangulo escaleno");
	}
	
	@Test
	public void testeNaoTriangulo(){
		Forma form = new Forma(4.1f, 4.0f, 8.3f);
		String valor = form.verificaForma();
		Assert.assertEquals(valor, "Não é um triangulo");
	}
}
