package org.freedom.persist.entity;

// Generated 20/11/2013 10:59:59 by Hibernate Tools 4.0.0

/**
 * EqinvprodId generated by hbm2java
 */
public class EqinvprodId implements java.io.Serializable {

	private int codinvprod;
	private short codfilial;
	private int codemp;

	public EqinvprodId() {
	}

	public EqinvprodId(int codinvprod, short codfilial, int codemp) {
		this.codinvprod = codinvprod;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	public int getCodinvprod() {
		return this.codinvprod;
	}

	public void setCodinvprod(int codinvprod) {
		this.codinvprod = codinvprod;
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
		if (!(other instanceof EqinvprodId))
			return false;
		EqinvprodId castOther = (EqinvprodId) other;

		return (this.getCodinvprod() == castOther.getCodinvprod())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodinvprod();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
