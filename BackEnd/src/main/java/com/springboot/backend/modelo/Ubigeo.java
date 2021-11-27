package com.springboot.backend.modelo;

import javax.persistence.*;

@Entity
@Table(name = "ubigeo")
public class Ubigeo {
	
	@Id
	@Column(name = "codubi")
	private String id;
	
	@Column(name = "depubi")
	private String depubi;
	
	@Column(name = "proubi")
	private String proubi;
	
	@Column(name = "disubi")
	private String disubi;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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