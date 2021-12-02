package com.springboot.backend.modelo;

import javax.persistence.*;

@Entity
@Table(name = "ubigeo")
public class Ubigeo {
	
	@Id
	@Column(name = "codubi")
	private String codubi;
	
	@Column(name = "depubi")
	private String depubi;
	
	@Column(name = "proubi")
	private String proubi;
	
	@Column(name = "disubi")
	private String disubi;
	
	public String getCodubi() {
		return codubi;
	}

	public void setCodubi(String codubi) {
		this.codubi = codubi;
	}

	public String getDepubi() {
		return depubi;
	}

	public void setDepubi(String depubi) {
		this.depubi = depubi;
	}

	public String getProubi() {
		return proubi;
	}

	public void setProubi(String proubi) {
		this.proubi = proubi;
	}

	public String getDisubi() {
		return disubi;
	}

	public void setDisubi(String disubi) {
		this.disubi = disubi;
	}

}