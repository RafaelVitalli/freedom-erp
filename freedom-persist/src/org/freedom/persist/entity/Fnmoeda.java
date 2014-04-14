package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Fnmoeda generated by hbm2java
 */
public class Fnmoeda implements java.io.Serializable {

	private FnmoedaId id;
	private Sgfilial sgfilial;
	private char tipomoeda;
	private char atualizamoeda;
	private String singmoeda;
	private String plurmoeda;
	private char codfbnmoeda;
	private String decsmoeda;
	private String decpmoeda;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set cpimportacaos = new HashSet(0);
	private Set eqprodutos = new HashSet(0);
	private Set fncontas = new HashSet(0);
	private Set sgprefere1s = new HashSet(0);
	private Set fncotmoedas = new HashSet(0);

	public Fnmoeda() {
	}

	public Fnmoeda(FnmoedaId id, Sgfilial sgfilial, char tipomoeda,
			char atualizamoeda, String singmoeda, String plurmoeda,
			char codfbnmoeda, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.tipomoeda = tipomoeda;
		this.atualizamoeda = atualizamoeda;
		this.singmoeda = singmoeda;
		this.plurmoeda = plurmoeda;
		this.codfbnmoeda = codfbnmoeda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Fnmoeda(FnmoedaId id, Sgfilial sgfilial, char tipomoeda,
			char atualizamoeda, String singmoeda, String plurmoeda,
			char codfbnmoeda, String decsmoeda, String decpmoeda, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt,
			Set cpimportacaos, Set eqprodutos, Set fncontas, Set sgprefere1s,
			Set fncotmoedas) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.tipomoeda = tipomoeda;
		this.atualizamoeda = atualizamoeda;
		this.singmoeda = singmoeda;
		this.plurmoeda = plurmoeda;
		this.codfbnmoeda = codfbnmoeda;
		this.decsmoeda = decsmoeda;
		this.decpmoeda = decpmoeda;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.cpimportacaos = cpimportacaos;
		this.eqprodutos = eqprodutos;
		this.fncontas = fncontas;
		this.sgprefere1s = sgprefere1s;
		this.fncotmoedas = fncotmoedas;
	}

	public FnmoedaId getId() {
		return this.id;
	}

	public void setId(FnmoedaId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public char getTipomoeda() {
		return this.tipomoeda;
	}

	public void setTipomoeda(char tipomoeda) {
		this.tipomoeda = tipomoeda;
	}

	public char getAtualizamoeda() {
		return this.atualizamoeda;
	}

	public void setAtualizamoeda(char atualizamoeda) {
		this.atualizamoeda = atualizamoeda;
	}

	public String getSingmoeda() {
		return this.singmoeda;
	}

	public void setSingmoeda(String singmoeda) {
		this.singmoeda = singmoeda;
	}

	public String getPlurmoeda() {
		return this.plurmoeda;
	}

	public void setPlurmoeda(String plurmoeda) {
		this.plurmoeda = plurmoeda;
	}

	public char getCodfbnmoeda() {
		return this.codfbnmoeda;
	}

	public void setCodfbnmoeda(char codfbnmoeda) {
		this.codfbnmoeda = codfbnmoeda;
	}

	public String getDecsmoeda() {
		return this.decsmoeda;
	}

	public void setDecsmoeda(String decsmoeda) {
		this.decsmoeda = decsmoeda;
	}

	public String getDecpmoeda() {
		return this.decpmoeda;
	}

	public void setDecpmoeda(String decpmoeda) {
		this.decpmoeda = decpmoeda;
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

	public Set getCpimportacaos() {
		return this.cpimportacaos;
	}

	public void setCpimportacaos(Set cpimportacaos) {
		this.cpimportacaos = cpimportacaos;
	}

	public Set getEqprodutos() {
		return this.eqprodutos;
	}

	public void setEqprodutos(Set eqprodutos) {
		this.eqprodutos = eqprodutos;
	}

	public Set getFncontas() {
		return this.fncontas;
	}

	public void setFncontas(Set fncontas) {
		this.fncontas = fncontas;
	}

	public Set getSgprefere1s() {
		return this.sgprefere1s;
	}

	public void setSgprefere1s(Set sgprefere1s) {
		this.sgprefere1s = sgprefere1s;
	}

	public Set getFncotmoedas() {
		return this.fncotmoedas;
	}

	public void setFncotmoedas(Set fncotmoedas) {
		this.fncotmoedas = fncotmoedas;
	}

}
