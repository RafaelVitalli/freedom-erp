package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Atatendimentoitrec generated by hbm2java
 */
public class Atatendimentoitrec implements java.io.Serializable {

	private AtatendimentoitrecId id;
	private Fnitreceber fnitreceber;
	private Atatendimento atatendimento;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Atatendimentoitrec() {
	}

	public Atatendimentoitrec(AtatendimentoitrecId id, Fnitreceber fnitreceber,
			Atatendimento atatendimento, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.fnitreceber = fnitreceber;
		this.atatendimento = atatendimento;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Atatendimentoitrec(AtatendimentoitrecId id, Fnitreceber fnitreceber,
			Atatendimento atatendimento, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.fnitreceber = fnitreceber;
		this.atatendimento = atatendimento;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public AtatendimentoitrecId getId() {
		return this.id;
	}

	public void setId(AtatendimentoitrecId id) {
		this.id = id;
	}

	public Fnitreceber getFnitreceber() {
		return this.fnitreceber;
	}

	public void setFnitreceber(Fnitreceber fnitreceber) {
		this.fnitreceber = fnitreceber;
	}

	public Atatendimento getAtatendimento() {
		return this.atatendimento;
	}

	public void setAtatendimento(Atatendimento atatendimento) {
		this.atatendimento = atatendimento;
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
