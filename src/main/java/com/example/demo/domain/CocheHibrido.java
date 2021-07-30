package com.example.demo.domain;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.example.demo.domain.piezas.*;

public class CocheHibrido extends Coche  {

	private TanqueHidrogeno tanqueHidrogeno;

	public CocheHibrido() {
		// TODO Auto-generated constructor stub
	}
	
	public CocheHibrido(Long id, String modelo, String color,Bateria bateria, Cinturones cinturones, AireAcondicionado aire, Puertas puertas,TanqueHidrogeno tanqueHidrogeno) {
		super(id, modelo, color, bateria, cinturones, aire, puertas);
		// TODO Auto-generated constructor stub
		this.tanqueHidrogeno = tanqueHidrogeno; 
	}

	public TanqueHidrogeno getTanqueHidrogeno() {
		return tanqueHidrogeno;
	}

	public void setTanqueHidrogeno(TanqueHidrogeno tanqueHidrogeno) {
		this.tanqueHidrogeno = tanqueHidrogeno;
	}
	
	public void addTanqueHidrogeno() {
		Logger logger
        = Logger.getLogger(
            CocheHibrido.class.getName());
	       logger.log(Level.INFO,"Tiene motor de hidrogeno arrancado");
		
	}

	@Override
	public String toString() {
		return "CocheHibrido [tanqueHidrogeno=" + tanqueHidrogeno + ", getId()=" + getId() + ", getModelo()="
				+ getModelo() + ", getColor()=" + getColor() + ", getBateria()=" + getBateria() + ", getCinturones()="
				+ getCinturones() + ", getAire()=" + getAire() + ", getPuertas()=" + getPuertas() + "]";
	}

	
}
