package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Ppitestruturasubprod generated by hbm2java
 */
public class Ppitestruturasubprod implements java.io.Serializable {

	private PpitestruturasubprodId id;
	private Ppestrufase ppestrufase;
	private Eqproduto eqproduto;
	private String refprod;
	private String refprodpd;
	private BigDecimal qtditestsp;
	private char qtdvariavel;
	private char qtdfixa;
	private char emmanut;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Ppitestruturasubprod() {
	}

	public Ppitestruturasubprod(PpitestruturasubprodId id,
			Ppestrufase ppestrufase, Eqproduto eqproduto,
			BigDecimal qtditestsp, char qtdvariavel, char qtdfixa,
			char emmanut, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.ppestrufase = ppestrufase;
		this.eqproduto = eqproduto;
		this.qtditestsp = qtditestsp;
		this.qtdvariavel = qtdvariavel;
		this.qtdfixa = qtdfixa;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Ppitestruturasubprod(PpitestruturasubprodId id,
			Ppestrufase ppestrufase, Eqproduto eqproduto, String refprod,
			String refprodpd, BigDecimal qtditestsp, char qtdvariavel,
			char qtdfixa, char emmanut, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.ppestrufase = ppestrufase;
		this.eqproduto = eqproduto;
		this.refprod = refprod;
		this.refprodpd = refprodpd;
		this.qtditestsp = qtditestsp;
		this.qtdvariavel = qtdvariavel;
		this.qtdfixa = qtdfixa;
		this.emmanut = emmanut;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public PpitestruturasubprodId getId() {
		return this.id;
	}

	public void setId(PpitestruturasubprodId id) {
		this.id = id;
	}

	public Ppestrufase getPpestrufase() {
		return this.ppestrufase;
	}

	public void setPpestrufase(Ppestrufase ppestrufase) {
		this.ppestrufase = ppestrufase;
	}

	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	public String getRefprod() {
		return this.refprod;
	}

	public void setRefprod(String refprod) {
		this.refprod = refprod;
	}

	public String getRefprodpd() {
		return this.refprodpd;
	}

	public void setRefprodpd(String refprodpd) {
		this.refprodpd = refprodpd;
	}

	public BigDecimal getQtditestsp() {
		return this.qtditestsp;
	}

	public void setQtditestsp(BigDecimal qtditestsp) {
		this.qtditestsp = qtditestsp;
	}

	public char getQtdvariavel() {
		return this.qtdvariavel;
	}

	public void setQtdvariavel(char qtdvariavel) {
		this.qtdvariavel = qtdvariavel;
	}

	public char getQtdfixa() {
		return this.qtdfixa;
	}

	public void setQtdfixa(char qtdfixa) {
		this.qtdfixa = qtdfixa;
	}

	public char getEmmanut() {
		return this.emmanut;
	}

	public void setEmmanut(char emmanut) {
		this.emmanut = emmanut;
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

}
