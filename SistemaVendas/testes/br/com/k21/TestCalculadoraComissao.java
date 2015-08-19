package br.com.k21;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalculadoraComissao {
	
	@Test
	public void testarCalculoParaVenda100reais() {
		double valorVenda = 100;
		double esperado = 5;
		
		double resultado = CalculadoraComissao.calcular(valorVenda);
		
		assertEquals(esperado, resultado, 0);
	}
	
	@Test
	public void testarCalculoParaVenda10000reais() {
		double valorVenda = 10000;
		double esperado = 500;
		
		double resultado = CalculadoraComissao.calcular(valorVenda);
		
		assertEquals(esperado, resultado, 0);
	}
	
	@Test
	public void testarCalculoParaVenda1Real() {
		double valorVenda = 1;
		double esperado = 0.05;
		
		double resultado = CalculadoraComissao.calcular(valorVenda);
		
		assertEquals(esperado, resultado, 0.000);
	}
	
	@Test
	public void testarCalculoParaVendaComValorDecimalEntrada() {
		double valorVenda = 20.20;
		double esperado = 1.01;
		
		double resultado = CalculadoraComissao.calcular(valorVenda);
		
		assertEquals(esperado, resultado, 0.000);
	}
}
