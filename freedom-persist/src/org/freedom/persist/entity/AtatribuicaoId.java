package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

/**
 * AtatribuicaoId generated by hbm2java
 */
public class AtatribuicaoId implements java.io.Serializable {

	private String codatrib;
	private int codfilial;
	private int codemp;

	public AtatribuicaoId() {
	}

	public AtatribuicaoId(String codatrib, int codfilial, int codemp) {
		this.codatrib = codatrib;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public String getCodatrib() {
		return this.codatrib;
	}

	public void setCodatrib(String codatrib) {
		this.codatrib = codatrib;
	}

	public int getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(int codfilial) {
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
		if (!(other instanceof AtatribuicaoId))
			return false;
		AtatribuicaoId castOther = (AtatribuicaoId) other;

		return ((this.getCodatrib() == castOther.getCodatrib()) || (this
				.getCodatrib() != null && castOther.getCodatrib() != null && this
				.getCodatrib().equals(castOther.getCodatrib())))
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodatrib() == null ? 0 : this.getCodatrib().hashCode());
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
