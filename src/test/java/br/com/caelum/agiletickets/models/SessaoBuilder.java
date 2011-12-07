package br.com.caelum.agiletickets.models;

import org.joda.time.DateTime;

import br.com.caelum.agiletickets.domain.RelogioDoSistema;

public class SessaoBuilder {
	
	private  Sessao instancia;
	
	public SessaoBuilder() {
		instancia = new Sessao();
		instancia.setDuracaoEmMinutos(10);
		
		Espetaculo e = new Espetaculo();
		e.setId(1L);
		
		instancia.setEspetaculo(e);
		instancia.setIngressosReservados(0);
		instancia.setInicio(new RelogioDoSistema().agora());
		instancia.setTotalIngressos(5);
	}
	
	public SessaoBuilder comEspetaculo(Espetaculo e) {
		instancia.setEspetaculo(e);
		return this;
	}
	
	public SessaoBuilder comQuantidadeDeIngressosReservados(int r) {
		instancia.setIngressosReservados(r);
		return this;
	}
	
	public SessaoBuilder comecandoNaData(DateTime data) {
		instancia.setInicio(data);
		return this;
	}
	
	public SessaoBuilder comTotalDeIngressos(int i) {
		instancia.setTotalIngressos(i);
		return this;
	}
	
	public SessaoBuilder comDuracaoEmMinutos(int min) {
		instancia.setDuracaoEmMinutos(min);
		return this;
	}
	
	public Sessao constroi() {
		return instancia;
	}

	public SessaoBuilder comPeriodicidade(Periodicidade p) {
		instancia.setPeriodicidade(p);
		return this;
	}

}
