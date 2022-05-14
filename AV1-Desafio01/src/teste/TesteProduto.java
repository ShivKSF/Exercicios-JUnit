package teste;

import org.junit.Assert;
import dominio.Produto;
import org.junit.Test;

public class TesteProduto {
	@Test
	public void testeProdutoDinheiro(){
		Produto prod = new Produto(5, 10, 15.0, 1);
		double valor = prod.calculaDesconto();
		double valorFinal = prod.valorFinal();
		Assert.assertEquals(valor, 15.0, 0);
		Assert.assertEquals(valorFinal, 135.0, 0);
	}
	@Test
	public void testeProdutoCheque(){
		Produto prod = new Produto(5, 10, 15.0, 2);
		double valor = prod.calculaDesconto();
		double valorFinal = prod.valorFinal();
		Assert.assertEquals(valor, 3.0, 0);
		Assert.assertEquals(valorFinal, 147.0, 0);
	}
	@Test
	public void testeProdutoCredito(){
		Produto prod = new Produto(5, 10, 15.0, 3);
		double valor = prod.calculaDesconto();
		double valorFinal = prod.valorFinal();
		Assert.assertEquals(valor, 7.5, 0);
		Assert.assertEquals(valorFinal, 142.5, 0);
	}
	@Test
	public void testeProdutoDebito(){
		Produto prod = new Produto(5, 10, 15.0, 4);
		double valor = prod.calculaDesconto();
		double valorFinal = prod.valorFinal();
		Assert.assertEquals(valor, 7.5, 0);
		Assert.assertEquals(valorFinal, 142.5, 0);
	}
}
