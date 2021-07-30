package com.example.demo.domain.piezas;

public class TanqueHidrogeno {
	
	private Long id;
	private Double depositoHidrogeno;
	public TanqueHidrogeno(Long id, Double depositoHidrogeno) {
		super();
		this.id = id;
		this.depositoHidrogeno = depositoHidrogeno;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getDepositoHidrogeno() {
		return depositoHidrogeno;
	}
	public void setDepositoHidrogeno(Double depositoHidrogeno) {
		this.depositoHidrogeno = depositoHidrogeno;
	}
	

	
	@Override
	public String toString() {
		return "TanqueHidrogeno [id=" + id + ", depositoHidrogeno=" + depositoHidrogeno + "]";
	}

	
}
