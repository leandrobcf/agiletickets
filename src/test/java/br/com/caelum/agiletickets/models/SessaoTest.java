package br.com.caelum.agiletickets.models;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SessaoTest {

	private SessaoBuilder builder;
	
	@Before
	public void inicializa() {
		builder = new SessaoBuilder();
	}

	@Test
	public void deveVender1ingressoSeHa2vagas() throws Exception {		
        Sessao s = builder.comTotalDeIngressos(2).constroi();

        Assert.assertTrue(s.podeReservar(1));
	}

	

	@Test
	public void naoDeveVender3ingressoSeHa2vagas() throws Exception {
		
		Sessao s = builder.comTotalDeIngressos(2).constroi();

		Assert.assertFalse(s.podeReservar(3));
	}

	@Test
	public void reservarIngressosDeveDiminuirONumeroDeIngressosDisponiveis() throws Exception {
	
		Sessao s = builder.comTotalDeIngressos(5).constroi();

		s.reserva(3);
		Assert.assertEquals(2, s.getIngressosDisponiveis().intValue());
	}
	
	@Test
	public void devePoderReservarTodosIngressosDisponiveis() throws Exception {
		
		Sessao s = builder.comTotalDeIngressos(5).constroi();
		
		Assert.assertTrue(s.podeReservar(5));
	}
}
