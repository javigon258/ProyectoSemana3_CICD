package com.example.demo.domain;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.example.demo.domain.piezas.*;

public class CocheElectrico extends Coche {
	
	private BateriaElectrica bateriaElectrica;
	

	public CocheElectrico() {
		// TODO Auto-generated constructor stub
	}
	
	public CocheElectrico(Long id, String modelo, String color, Bateria bateria, Cinturones cinturones, AireAcondicionado aire, Puertas puertas,BateriaElectrica bateriaElectrica) {
		super(id, modelo, color, bateria, cinturones, aire, puertas);
		this.bateriaElectrica = bateriaElectrica;
	}
	

	public BateriaElectrica getBateriaElectrica() {
		return bateriaElectrica;
	}

	public void setBateriaElectrica(BateriaElectrica bateriaElectrica) {
		this.bateriaElectrica = bateriaElectrica;
	}

	public void addBateriaElectrica() {
	       Logger logger
           = Logger.getLogger(
               CocheElectrico.class.getName());
	       logger.log(Level.INFO,"Tiene motor electrico arrancado");
	}

	@Override
	public String toString() {
		return "CocheElectrico [bateriaElectrica=" + bateriaElectrica + ", getId()=" + getId() + ", getModelo()="
				+ getModelo() + ", getColor()=" + getColor() + ", getBateria()=" + getBateria() + ", getCinturones()="
				+ getCinturones() + ", getAire()=" + getAire() + ", getPuertas()=" + getPuertas() + "]";
	}

}
