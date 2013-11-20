package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ppestrufase generated by hbm2java
 */
public class Ppestrufase implements java.io.Serializable {

	private PpestrufaseId id;
	private Sgfilial sgfilial;
	private Ppfase ppfase;
	private Pptiporec pptiporec;
	private Ppestrutura ppestrutura;
	private BigDecimal tempoef;
	private char finalizaop;
	private String instrucoes;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set ppitestruturasubprods = new HashSet(0);
	private Set ppitestruturas = new HashSet(0);
	private Set ppestruanalises = new HashSet(0);
	private Set ppdistribs = new HashSet(0);

	public Ppestrufase() {
	}

	public Ppestrufase(PpestrufaseId id, Sgfilial sgfilial, Ppfase ppfase,
			Pptiporec pptiporec, Ppestrutura ppestrutura, BigDecimal tempoef,
			char finalizaop, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.ppfase = ppfase;
		this.pptiporec = pptiporec;
		this.ppestrutura = ppestrutura;
		this.tempoef = tempoef;
		this.finalizaop = finalizaop;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Ppestrufase(PpestrufaseId id, Sgfilial sgfilial, Ppfase ppfase,
			Pptiporec pptiporec, Ppestrutura ppestrutura, BigDecimal tempoef,
			char finalizaop, String instrucoes, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set ppitestruturasubprods, Set ppitestruturas, Set ppestruanalises,
			Set ppdistribs) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.ppfase = ppfase;
		this.pptiporec = pptiporec;
		this.ppestrutura = ppestrutura;
		this.tempoef = tempoef;
		this.finalizaop = finalizaop;
		this.instrucoes = instrucoes;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.ppitestruturasubprods = ppitestruturasubprods;
		this.ppitestruturas = ppitestruturas;
		this.ppestruanalises = ppestruanalises;
		this.ppdistribs = ppdistribs;
	}

	public PpestrufaseId getId() {
		return this.id;
	}

	public void setId(PpestrufaseId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Ppfase getPpfase() {
		return this.ppfase;
	}

	public void setPpfase(Ppfase ppfase) {
		this.ppfase = ppfase;
	}

	public Pptiporec getPptiporec() {
		return this.pptiporec;
	}

	public void setPptiporec(Pptiporec pptiporec) {
		this.pptiporec = pptiporec;
	}

	public Ppestrutura getPpestrutura() {
		return this.ppestrutura;
	}

	public void setPpestrutura(Ppestrutura ppestrutura) {
		this.ppestrutura = ppestrutura;
	}

	public BigDecimal getTempoef() {
		return this.tempoef;
	}

	public void setTempoef(BigDecimal tempoef) {
		this.tempoef = tempoef;
	}

	public char getFinalizaop() {
		return this.finalizaop;
	}

	public void setFinalizaop(char finalizaop) {
		this.finalizaop = finalizaop;
	}

	public String getInstrucoes() {
		return this.instrucoes;
	}

	public void setInstrucoes(String instrucoes) {
		this.instrucoes = instrucoes;
	}

	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	public Set getPpitestruturasubprods() {
		return this.ppitestruturasubprods;
	}

	public void setPpitestruturasubprods(Set ppitestruturasubprods) {
		this.ppitestruturasubprods = ppitestruturasubprods;
	}

	public Set getPpitestruturas() {
		return this.ppitestruturas;
	}

	public void setPpitestruturas(Set ppitestruturas) {
		this.ppitestruturas = ppitestruturas;
	}

	public Set getPpestruanalises() {
		return this.ppestruanalises;
	}

	public void setPpestruanalises(Set ppestruanalises) {
		this.ppestruanalises = ppestruanalises;
	}

	public Set getPpdistribs() {
		return this.ppdistribs;
	}

	public void setPpdistribs(Set ppdistribs) {
		this.ppdistribs = ppdistribs;
	}

}
