package com.example.demo.domain.piezas;

public class Bateria {
	
	private Long id;
	private Double capacidadBateria; // Voltios de
	
	public Bateria(Long id, Double capacidadBateria) {
		super();
		this.id = id;
		this.capacidadBateria = capacidadBateria;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getCapacidadBateria() {
		return capacidadBateria;
	}
	public void setCapacidadBateria(Double capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}
	@Override
	public String toString() {
		return "Bateria [id=" + id + ", capacidadBateria=" + capacidadBateria + "]";
	}

}
