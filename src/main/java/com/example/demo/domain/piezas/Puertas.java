package com.example.demo.domain.piezas;

public class Puertas {
	
	private Long id;
	private int numPuertas;
	public Puertas(Long id, int numPuertas) {
		super();
		this.id = id;
		this.numPuertas = numPuertas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	@Override
	public String toString() {
		return "Puertas [id=" + id + ", numPuertas=" + numPuertas + "]";
	}
		
}
