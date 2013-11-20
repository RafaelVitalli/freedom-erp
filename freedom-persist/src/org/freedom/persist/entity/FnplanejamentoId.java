package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * FnplanejamentoId generated by hbm2java
 */
public class FnplanejamentoId implements java.io.Serializable {

	private String codplan;
	private short codfilial;
	private int codemp;

	public FnplanejamentoId() {
	}

	public FnplanejamentoId(String codplan, short codfilial, int codemp) {
		this.codplan = codplan;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public String getCodplan() {
		return this.codplan;
	}

	public void setCodplan(String codplan) {
		this.codplan = codplan;
	}

	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FnplanejamentoId))
			return false;
		FnplanejamentoId castOther = (FnplanejamentoId) other;

		return ((this.getCodplan() == castOther.getCodplan()) || (this
				.getCodplan() != null && castOther.getCodplan() != null && this
				.getCodplan().equals(castOther.getCodplan())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodplan() == null ? 0 : this.getCodplan().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
