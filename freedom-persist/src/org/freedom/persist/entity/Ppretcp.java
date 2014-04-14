package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ppretcp generated by hbm2java
 */
public class Ppretcp implements java.io.Serializable {

	private PpretcpId id;
	private Ppop ppop;
	private Date dtretencao;
	private Date dtdescarte;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set ppitretcps = new HashSet(0);

	public Ppretcp() {
	}

	public Ppretcp(Ppop ppop, Date dtretencao, Date dtdescarte, Date dtins,
			String idusuins) {
		this.ppop = ppop;
		this.dtretencao = dtretencao;
		this.dtdescarte = dtdescarte;
		this.dtins = dtins;
		this.idusuins = idusuins;
	}

	public Ppretcp(Ppop ppop, Date dtretencao, Date dtdescarte, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set ppitretcps) {
		this.ppop = ppop;
		this.dtretencao = dtretencao;
		this.dtdescarte = dtdescarte;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.ppitretcps = ppitretcps;
	}

	public PpretcpId getId() {
		return this.id;
	}

	public void setId(PpretcpId id) {
		this.id = id;
	}

	public Ppop getPpop() {
		return this.ppop;
	}

	public void setPpop(Ppop ppop) {
		this.ppop = ppop;
	}

	public Date getDtretencao() {
		return this.dtretencao;
	}

	public void setDtretencao(Date dtretencao) {
		this.dtretencao = dtretencao;
	}

	public Date getDtdescarte() {
		return this.dtdescarte;
	}

	public void setDtdescarte(Date dtdescarte) {
		this.dtdescarte = dtdescarte;
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

	public Set getPpitretcps() {
		return this.ppitretcps;
	}

	public void setPpitretcps(Set ppitretcps) {
		this.ppitretcps = ppitretcps;
	}

}
