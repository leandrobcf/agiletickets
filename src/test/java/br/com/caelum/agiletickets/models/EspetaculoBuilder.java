package br.com.caelum.agiletickets.models;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import br.com.caelum.agiletickets.domain.RelogioDoSistema;


public class EspetaculoBuilder {
	
private  Espetaculo instancia;
	
	public EspetaculoBuilder() {
		instancia = new Espetaculo();
		
		instancia.setDescricao("e1");
		instancia.setId(1L);
		instancia.setNome("e1");
		instancia.setTipo(TipoDeEspetaculo.CINEMA);
		instancia.setEstabelecimento(new Estabelecimento());
	}
	
	public EspetaculoBuilder comSessaoUnica() {
		
		LocalDate d = new LocalDate().withDayOfMonth(1).withMonthOfYear(1).withYear(2012);
		LocalTime t = new LocalTime().withHourOfDay(12).withMinuteOfHour(0);
		
		instancia.criaSessoes(d, d, t, Periodicidade.DIARIA);
		
		return this;
	}
	
	public EspetaculoBuilder comSessoesDiarias() {
		
		LocalDate d = new LocalDate().withDayOfMonth(1).withMonthOfYear(1).withYear(2012);
		LocalTime t = new LocalTime().withHourOfDay(12).withMinuteOfHour(0);
		
		instancia.criaSessoes(d, d.plusDays(5), t, Periodicidade.DIARIA);
		
		return this;
	}
	
	public Espetaculo constroi() {
		return instancia;
	}

	public EspetaculoBuilder comSessoesSemanais() {
		LocalDate d = new LocalDate().withDayOfMonth(1).withMonthOfYear(1).withYear(2012);
		LocalTime t = new LocalTime().withHourOfDay(12).withMinuteOfHour(0);
		
		instancia.criaSessoes(d, d.plusDays(30), t, Periodicidade.SEMANAL);
		
		return this;
	}

}
