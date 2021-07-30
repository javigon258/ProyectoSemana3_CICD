package com.example.demo.domain;

import com.example.demo.domain.piezas.*;

public abstract class Coche {
	
	private Long id;
	private String modelo;
	private String color;
	private Bateria bateria;
	private Cinturones cinturones;
	private AireAcondicionado aire;
	private Puertas puertas;
	
	protected Coche() {
		
	}

	protected Coche(Long id, String modelo, String color, Bateria bateria, Cinturones cinturones, AireAcondicionado aire,
			Puertas puertas) {
		this.id = id;
		this.modelo = modelo;
		this.color = color;
		this.bateria = bateria;
		this.cinturones = cinturones;
		this.aire = aire;
		this.puertas = puertas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}

	public Cinturones getCinturones() {
		return cinturones;
	}

	public void setCinturones(Cinturones cinturones) {
		this.cinturones = cinturones;
	}

	public AireAcondicionado getAire() {
		return aire;
	}

	public void setAire(AireAcondicionado aire) {
		this.aire = aire;
	}

	public Puertas getPuertas() {
		return puertas;
	}

	public void setPuertas(Puertas puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", modelo=" + modelo + ", color=" + color + ", bateria=" + bateria + ", cinturones="
				+ cinturones + ", aire=" + aire + ", puertas=" + puertas + "]";
	}
	
}