package org.freedom.persist.entity;

// Generated 14/04/2014 10:17:08 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Rhcurso generated by hbm2java
 */
public class Rhcurso implements java.io.Serializable {

	private RhcursoId id;
	private Sgfilial sgfilial;
	private Rharea rharea;
	private Rhnivelcurso rhnivelcurso;
	private String desccurso;
	private String contprogcurso;
	private String instituicaocurso;
	private Short duracaocurso;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set rhvagacursos = new HashSet(0);
	private Set rhcandidatocursos = new HashSet(0);

	public Rhcurso() {
	}

	public Rhcurso(RhcursoId id, Sgfilial sgfilial, Rhnivelcurso rhnivelcurso,
			String desccurso, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.rhnivelcurso = rhnivelcurso;
		this.desccurso = desccurso;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Rhcurso(RhcursoId id, Sgfilial sgfilial, Rharea rharea,
			Rhnivelcurso rhnivelcurso, String desccurso, String contprogcurso,
			String instituicaocurso, Short duracaocurso, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set rhvagacursos, Set rhcandidatocursos) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.rharea = rharea;
		this.rhnivelcurso = rhnivelcurso;
		this.desccurso = desccurso;
		this.contprogcurso = contprogcurso;
		this.instituicaocurso = instituicaocurso;
		this.duracaocurso = duracaocurso;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.rhvagacursos = rhvagacursos;
		this.rhcandidatocursos = rhcandidatocursos;
	}

	public RhcursoId getId() {
		return this.id;
	}

	public void setId(RhcursoId id) {
		this.id = id;
	}

	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	public Rharea getRharea() {
		return this.rharea;
	}

	public void setRharea(Rharea rharea) {
		this.rharea = rharea;
	}

	public Rhnivelcurso getRhnivelcurso() {
		return this.rhnivelcurso;
	}

	public void setRhnivelcurso(Rhnivelcurso rhnivelcurso) {
		this.rhnivelcurso = rhnivelcurso;
	}

	public String getDesccurso() {
		return this.desccurso;
	}

	public void setDesccurso(String desccurso) {
		this.desccurso = desccurso;
	}

	public String getContprogcurso() {
		return this.contprogcurso;
	}

	public void setContprogcurso(String contprogcurso) {
		this.contprogcurso = contprogcurso;
	}

	public String getInstituicaocurso() {
		return this.instituicaocurso;
	}

	public void setInstituicaocurso(String instituicaocurso) {
		this.instituicaocurso = instituicaocurso;
	}

	public Short getDuracaocurso() {
		return this.duracaocurso;
	}

	public void setDuracaocurso(Short duracaocurso) {
		this.duracaocurso = duracaocurso;
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

	public Set getRhvagacursos() {
		return this.rhvagacursos;
	}

	public void setRhvagacursos(Set rhvagacursos) {
		this.rhvagacursos = rhvagacursos;
	}

	public Set getRhcandidatocursos() {
		return this.rhcandidatocursos;
	}

	public void setRhcandidatocursos(Set rhcandidatocursos) {
		this.rhcandidatocursos = rhcandidatocursos;
	}

}
