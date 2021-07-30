package com.example.demo.domain.piezas;

public class BateriaElectrica {
	
	private Long id;
	private double voltioMotor;
	
	public BateriaElectrica(Long id, double voltioMotor) {
		super();
		this.id = id;
		this.voltioMotor = voltioMotor;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getVoltioMotor() {
		return voltioMotor;
	}
	public void setVoltioMotor(double voltioMotor) {
		this.voltioMotor = voltioMotor;
	}
	@Override
	public String toString() {
		return "BateriaElectrica [id=" + id + ", voltioMotor=" + voltioMotor + "]";
	}
	
}
