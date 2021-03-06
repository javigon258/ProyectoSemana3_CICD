package com.example.demo.domain;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.example.demo.domain.piezas.*;

public class CocheGasolina extends Coche {
	
	private MotorGasolina motorGasolina;

	public CocheGasolina() {
		
	}
	
	public CocheGasolina(Long id, String modelo, String color, Bateria bateria, Cinturones cinturones, AireAcondicionado aire, Puertas puertas,MotorGasolina motorGasolina) {
		super(id, modelo, color, bateria, cinturones, aire, puertas);
		// TODO Auto-generated constructor stub
		this.motorGasolina = motorGasolina;
	}
	

	public MotorGasolina getMotorGasolina() {
		return motorGasolina;
	}

	public void setMotorGasolina(MotorGasolina motorGasolina) {
		this.motorGasolina = motorGasolina;
	}

	public void addMotorGasolina() {
		Logger logger
        = Logger.getLogger(
            CocheGasolina.class.getName());
	       logger.log(Level.INFO,"Tiene motor de gasolina");
		
	}

	@Override
	public String toString() {
		return "CocheGasolina [motorGasolina=" + motorGasolina + ", getId()=" + getId() + ", getModelo()=" + getModelo()
				+ ", getColor()=" + getColor() + ", getBateria()=" + getBateria() + ", getCinturones()="
				+ getCinturones() + ", getAire()=" + getAire() + ", getPuertas()=" + getPuertas() + "]";
	}

	
}
