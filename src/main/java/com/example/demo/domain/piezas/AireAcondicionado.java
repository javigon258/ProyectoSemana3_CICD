package com.example.demo.domain.piezas;

public class AireAcondicionado {
	
	private Long id;
	private boolean tieneAire = true;
	
	public AireAcondicionado(Long id, boolean tieneAire) {
		super();
		this.id = id;
		this.tieneAire = tieneAire;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isTieneAire() {
		return tieneAire;
	}
	public void setTieneAire(boolean tieneAire) {
		this.tieneAire = tieneAire;
	}

	@Override
	public String toString() {
		return "AireAcondicionado [id=" + id + ", tieneAire=" + tieneAire + "]";
	}
	
}
