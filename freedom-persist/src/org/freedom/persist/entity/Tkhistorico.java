package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Tkhistorico generated by hbm2java
 */
public class Tkhistorico implements java.io.Serializable {

	private TkhistoricoId id;
	private Tksitcamp tksitcamp;
	private Atatendente atatendente;
	private Tkcontato tkcontato;
	private Vdcliente vdcliente;
	private Date datahisttk;
	private Date horahisttk;
	private String deschisttk;
	private String sithisttk;
	private Character tipohisttk;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Tkhistorico() {
	}

	public Tkhistorico(TkhistoricoId id, Atatendente atatendente,
			Date datahisttk, Date horahisttk, String deschisttk,
			String sithisttk, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.atatendente = atatendente;
		this.datahisttk = datahisttk;
		this.horahisttk = horahisttk;
		this.deschisttk = deschisttk;
		this.sithisttk = sithisttk;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tkhistorico(TkhistoricoId id, Tksitcamp tksitcamp,
			Atatendente atatendente, Tkcontato tkcontato, Vdcliente vdcliente,
			Date datahisttk, Date horahisttk, String deschisttk,
			String sithisttk, Character tipohisttk, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.tksitcamp = tksitcamp;
		this.atatendente = atatendente;
		this.tkcontato = tkcontato;
		this.vdcliente = vdcliente;
		this.datahisttk = datahisttk;
		this.horahisttk = horahisttk;
		this.deschisttk = deschisttk;
		this.sithisttk = sithisttk;
		this.tipohisttk = tipohisttk;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public TkhistoricoId getId() {
		return this.id;
	}

	public void setId(TkhistoricoId id) {
		this.id = id;
	}

	public Tksitcamp getTksitcamp() {
		return this.tksitcamp;
	}

	public void setTksitcamp(Tksitcamp tksitcamp) {
		this.tksitcamp = tksitcamp;
	}

	public Atatendente getAtatendente() {
		return this.atatendente;
	}

	public void setAtatendente(Atatendente atatendente) {
		this.atatendente = atatendente;
	}

	public Tkcontato getTkcontato() {
		return this.tkcontato;
	}

	public void setTkcontato(Tkcontato tkcontato) {
		this.tkcontato = tkcontato;
	}

	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	public Date getDatahisttk() {
		return this.datahisttk;
	}

	public void setDatahisttk(Date datahisttk) {
		this.datahisttk = datahisttk;
	}

	public Date getHorahisttk() {
		return this.horahisttk;
	}

	public void setHorahisttk(Date horahisttk) {
		this.horahisttk = horahisttk;
	}

	public String getDeschisttk() {
		return this.deschisttk;
	}

	public void setDeschisttk(String deschisttk) {
		this.deschisttk = deschisttk;
	}

	public String getSithisttk() {
		return this.sithisttk;
	}

	public void setSithisttk(String sithisttk) {
		this.sithisttk = sithisttk;
	}

	public Character getTipohisttk() {
		return this.tipohisttk;
	}

	public void setTipohisttk(Character tipohisttk) {
		this.tipohisttk = tipohisttk;
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
