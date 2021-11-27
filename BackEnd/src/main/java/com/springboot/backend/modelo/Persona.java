package com.springboot.backend.modelo;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codper")
	private int id;
	
	@Column(name = "nomper")
	private String nomper;
	
	@Column(name = "apeper")
	private String apeper;
	
	@Column(name = "userper")
	private String userper;
	
	@Column(name = "pswdper")
	private String pswdper;
	
	@Column(name = "dirper")
	private String dirper;
	
	@Column(name = "emaper")
	private String emaper;
	
	@Column(name = "dniper")
	private String dniper;
	
	@Column(name = "celper")
	private String celper;
	
	@Column(name = "rolper")
	private String rolper;
	
	@ManyToOne
	@JoinColumn(name = "codubi")
	private Ubigeo codubi;
	
	@Column(name = "estper")
	private String estper;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomper() {
		return nomper;
	}

	public void setNomper(String nomper) {
		this.nomper = nomper;
	}

	public String getApeper() {
		return apeper;
	}

	public void setApeper(String apeper) {
		this.apeper = apeper;
	}

	public String getUserper() {
		return userper;
	}

	public void setUserper(String userper) {
		this.userper = userper;
	}

	public String getPswdper() {
		return pswdper;
	}

	public void setPswdper(String pswdper) {
		this.pswdper = pswdper;
	}

	public String getDirper() {
		return dirper;
	}

	public void setDirper(String dirper) {
		this.dirper = dirper;
	}

	public String getEmaper() {
		return emaper;
	}

	public void setEmaper(String emaper) {
		this.emaper = emaper;
	}

	public String getDniper() {
		return dniper;
	}

	public void setDniper(String dniper) {
		this.dniper = dniper;
	}

	public String getCelper() {
		return celper;
	}

	public void setCelper(String celper) {
		this.celper = celper;
	}

	public String getRolper() {
		return rolper;
	}

	public void setRolper(String rolper) {
		this.rolper = rolper;
	}

	public Ubigeo getCodubi() {
		return codubi;
	}

	public void setCodubi(Ubigeo codubi) {
		this.codubi = codubi;
	}

	public String getEstper() {
		return estper;
	}

	public void setEstper(String estper) {
		this.estper = estper;
	}
}