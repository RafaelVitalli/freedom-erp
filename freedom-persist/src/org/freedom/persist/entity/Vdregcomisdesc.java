package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

/**
 * Vdregcomisdesc generated by hbm2java
 */
public class Vdregcomisdesc implements java.io.Serializable {

	private VdregcomisdescId id;
	private Sgfilial sgfilial;
	private String descregcomisdesc;
	private BigDecimal desconto;
	private BigDecimal comissao;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Vdregcomisdesc() {
	}

	public Vdregcomisdesc(VdregcomisdescId id, Sgfilial sgfilial) {
		this.id = id;
		this.sgfilial = sgfilial;
	}

	public Vdregcomisdesc(VdregcomisdescId id, Sgfilial sgfilial,
			String descregcomisdesc, BigDecimal desconto, BigDecimal comissao,
			Date dtins, Date hins, String idusuins, Date dtalt, Date halt,
			String idusualt) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descregcomisdesc = descregcomisdesc;
		this.desconto = desconto;
		this.comissao = comissao;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public VdregcomisdescId getId() {
		return this.id;
	}

	public void setId(VdregcomisdescId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public String getDescregcomisdesc() {
		return this.descregcomisdesc;
	}

	public void setDescregcomisdesc(String descregcomisdesc) {
		this.descregcomisdesc = descregcomisdesc;
	}

	public BigDecimal getDesconto() {
		return this.desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public BigDecimal getComissao() {
		return this.comissao;
	}

	public void setComissao(BigDecimal comissao) {
		this.comissao = comissao;
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
