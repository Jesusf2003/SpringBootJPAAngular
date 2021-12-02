package com.springboot.backend.modelo;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codprod")
	private int codprod;
	
	@Column(name = "nompro")
	private String nompro;
	
	@Column(name = "cospro")
	private String cospro;
	
	@Column(name = "prepro")
	private float prepro;
	
	@Column(name = "tampro")
	private String tampro;
	
	@Column(name = "stockpro")
	private int stockpro;
	
	@Column(name = "estpro")
	private String estpro;

	public int getCodprod() {
		return codprod;
	}

	public void setCodprod(int codprod) {
		this.codprod = codprod;
	}

	public String getNompro() {
		return nompro;
	}

	public void setNompro(String nompro) {
		this.nompro = nompro;
	}

	public String getCospro() {
		return cospro;
	}

	public void setCospro(String cospro) {
		this.cospro = cospro;
	}

	public float getPrepro() {
		return prepro;
	}

	public void setPrepro(float prepro) {
		this.prepro = prepro;
	}

	public String getTampro() {
		return tampro;
	}

	public void setTampro(String tampro) {
		this.tampro = tampro;
	}

	public int getStockpro() {
		return stockpro;
	}

	public void setStockpro(int stockpro) {
		this.stockpro = stockpro;
	}

	public String getEstpro() {
		return estpro;
	}

	public void setEstpro(String estpro) {
		this.estpro = estpro;
	}
}