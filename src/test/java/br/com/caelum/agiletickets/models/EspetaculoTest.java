package br.com.caelum.agiletickets.models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EspetaculoTest {
	
	private EspetaculoBuilder builder;
	
	@Before
	public void inicializa() {
		builder = new EspetaculoBuilder();
	}
	
	
	@Test
	public void deveCriarEspetaculoComSessaoUnica() {
		
		Espetaculo e = builder.comSessaoUnica().constroi();
		
		Assert.assertTrue(e.getSessoes().size() == 1);
		
	}
	
	@Test
	public void deveCriarEspetaculoComMaisDeUmaSessaoDiaria() {
		
		Espetaculo e = builder.comSessoesDiarias().constroi();
		
		Assert.assertTrue(e.getSessoes().size() == 5);
		
	}
	
	@Test
	public void deveCriarEspetaculoComMaisDeUmaSessaoSemanal() {
		
		Espetaculo e = builder.comSessoesSemanais().constroi();
		
		Assert.assertTrue(e.getSessoes().size() == 4);
		
	}

}
