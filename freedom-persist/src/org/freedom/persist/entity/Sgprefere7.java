package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Sgprefere7 generated by hbm2java
 */
public class Sgprefere7 implements java.io.Serializable {

	private Sgprefere7Id id;
	private Fnplanejamento fnplanejamentoBySgpref7fkfnplanconsig;
	private Eqtipomov eqtipomovBySgpref7fkeqtipmco;
	private Fnplanejamento fnplanejamentoBySgpref7fnplanvdconsig;
	private Eqtipomov eqtipomovBySgpref7fkeqtipmtv;
	private Eqtipomov eqtipomovBySgpref7fkeqtipmtp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgprefere7() {
	}

	public Sgprefere7(Sgprefere7Id id, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Sgprefere7(Sgprefere7Id id,
			Fnplanejamento fnplanejamentoBySgpref7fkfnplanconsig,
			Eqtipomov eqtipomovBySgpref7fkeqtipmco,
			Fnplanejamento fnplanejamentoBySgpref7fnplanvdconsig,
			Eqtipomov eqtipomovBySgpref7fkeqtipmtv,
			Eqtipomov eqtipomovBySgpref7fkeqtipmtp, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.fnplanejamentoBySgpref7fkfnplanconsig = fnplanejamentoBySgpref7fkfnplanconsig;
		this.eqtipomovBySgpref7fkeqtipmco = eqtipomovBySgpref7fkeqtipmco;
		this.fnplanejamentoBySgpref7fnplanvdconsig = fnplanejamentoBySgpref7fnplanvdconsig;
		this.eqtipomovBySgpref7fkeqtipmtv = eqtipomovBySgpref7fkeqtipmtv;
		this.eqtipomovBySgpref7fkeqtipmtp = eqtipomovBySgpref7fkeqtipmtp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Sgprefere7Id getId() {
		return this.id;
	}

	public void setId(Sgprefere7Id id) {
		this.id = id;
	}

	public Fnplanejamento getFnplanejamentoBySgpref7fkfnplanconsig() {
		return this.fnplanejamentoBySgpref7fkfnplanconsig;
	}

	public void setFnplanejamentoBySgpref7fkfnplanconsig(
			Fnplanejamento fnplanejamentoBySgpref7fkfnplanconsig) {
		this.fnplanejamentoBySgpref7fkfnplanconsig = fnplanejamentoBySgpref7fkfnplanconsig;
	}

	public Eqtipomov getEqtipomovBySgpref7fkeqtipmco() {
		return this.eqtipomovBySgpref7fkeqtipmco;
	}

	public void setEqtipomovBySgpref7fkeqtipmco(
			Eqtipomov eqtipomovBySgpref7fkeqtipmco) {
		this.eqtipomovBySgpref7fkeqtipmco = eqtipomovBySgpref7fkeqtipmco;
	}

	public Fnplanejamento getFnplanejamentoBySgpref7fnplanvdconsig() {
		return this.fnplanejamentoBySgpref7fnplanvdconsig;
	}

	public void setFnplanejamentoBySgpref7fnplanvdconsig(
			Fnplanejamento fnplanejamentoBySgpref7fnplanvdconsig) {
		this.fnplanejamentoBySgpref7fnplanvdconsig = fnplanejamentoBySgpref7fnplanvdconsig;
	}

	public Eqtipomov getEqtipomovBySgpref7fkeqtipmtv() {
		return this.eqtipomovBySgpref7fkeqtipmtv;
	}

	public void setEqtipomovBySgpref7fkeqtipmtv(
			Eqtipomov eqtipomovBySgpref7fkeqtipmtv) {
		this.eqtipomovBySgpref7fkeqtipmtv = eqtipomovBySgpref7fkeqtipmtv;
	}

	public Eqtipomov getEqtipomovBySgpref7fkeqtipmtp() {
		return this.eqtipomovBySgpref7fkeqtipmtp;
	}

	public void setEqtipomovBySgpref7fkeqtipmtp(
			Eqtipomov eqtipomovBySgpref7fkeqtipmtp) {
		this.eqtipomovBySgpref7fkeqtipmtp = eqtipomovBySgpref7fkeqtipmtp;
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
