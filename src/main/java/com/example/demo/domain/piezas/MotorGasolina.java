package com.example.demo.domain.piezas;

public class MotorGasolina {
	
	private Long id;
	private double eficet95;
	
	public MotorGasolina(Long id, double eficet95) {
		super();
		this.id = id;
		this.eficet95 = eficet95;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getEficet95() {
		return eficet95;
	}
	public void setEficet95(double eficet95) {
		this.eficet95 = eficet95;
	}
	@Override
	public String toString() {
		return "MotorGasolina [id=" + id + ", eficet95=" + eficet95 + "]";
	}
	
}
