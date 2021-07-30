package com.example.demo.service;

import com.example.demo.domain.Coche;
import com.example.demo.domain.CocheElectrico;
import com.example.demo.domain.CocheGasolina;
import com.example.demo.domain.CocheHibrido;
import com.example.demo.domain.piezas.AireAcondicionado;
import com.example.demo.domain.piezas.Bateria;
import com.example.demo.domain.piezas.BateriaElectrica;
import com.example.demo.domain.piezas.Cinturones;
import com.example.demo.domain.piezas.MotorGasolina;
import com.example.demo.domain.piezas.Puertas;
import com.example.demo.domain.piezas.TanqueHidrogeno;

public class CochesFacade {
	
	private CochesFacade() {
		
	}
	
	public static Coche creaCocheElectrico1() {
		AireAcondicionado aireAcondicionado = new AireAcondicionado(1L, true);
		Bateria bateria = new Bateria(1L, 270d);
		Cinturones cinturones = new Cinturones(1L, 5);
		Puertas puertas = new Puertas(1L, 5);
		
		BateriaElectrica bateraElectrica = new BateriaElectrica(1L, 2555d);
			
		CocheElectrico cocheElectrico = new CocheElectrico(1L, "Model S", "Azul",bateria, cinturones, aireAcondicionado, puertas, bateraElectrica);
		
		return cocheElectrico;
	}
	
	public static Coche creaCocheElectrico2() {
		AireAcondicionado aireAcondicionado = new AireAcondicionado(1L, true);
		Bateria bateria = new Bateria(1L, 50d);
		Cinturones cinturones = new Cinturones(1L, 4);
		Puertas puertas = new Puertas(1L, 4);
		
		BateriaElectrica bateraElectrica = new BateriaElectrica(1L, 755d);
			
		CocheElectrico cocheElectrico = new CocheElectrico(2L, "Renault ZERO", "Azul",bateria, cinturones, aireAcondicionado, puertas, bateraElectrica);
		
		return cocheElectrico;
	}
	
	public static Coche creaCocheElectrico3() {
		AireAcondicionado aireAcondicionado = new AireAcondicionado(1L, false);
		Bateria bateria = new Bateria(1L, 155d);
		Cinturones cinturones = new Cinturones(1L, 5);
		Puertas puertas = new Puertas(1L, 4);
		
		BateriaElectrica bateraElectrica = new BateriaElectrica(1L, 955d);
			
		CocheElectrico cocheElectrico = new CocheElectrico(3L, "Nissan Leaf", "Rojo",bateria, cinturones, aireAcondicionado, puertas, bateraElectrica);
		
		return cocheElectrico;
	}
	
	public static Coche creaCocheGasolina1() {
		AireAcondicionado aireAcondicionado = new AireAcondicionado(1L, true);
		Bateria bateria = new Bateria(1L, 50d);
		Cinturones cinturones = new Cinturones(1L, 4);
		Puertas puertas = new Puertas(1L, 4);
		
		MotorGasolina motorGasolina = new MotorGasolina(1L, 155d);
			
		CocheGasolina cocheGasolina = new CocheGasolina(1L, "Renault Megane", "Azul",bateria, cinturones, aireAcondicionado, puertas, motorGasolina);
		
		return cocheGasolina;
	}
	
	public static Coche creaCocheGasolina2() {
		AireAcondicionado aireAcondicionado = new AireAcondicionado(1L, false);
		Bateria bateria = new Bateria(1L, 25d);
		Cinturones cinturones = new  Cinturones(1L, 4);
		Puertas puertas = new Puertas(1L, 4);

		MotorGasolina motorGasolina = new MotorGasolina(1L, 155d);
		
		CocheGasolina cocheGasolina = new CocheGasolina(2L, "Peugeot 208", "Rojo",bateria, cinturones, aireAcondicionado, puertas, motorGasolina);
		
		return cocheGasolina;
	}
	
	public static Coche creaCocheHibrido1() {
		AireAcondicionado aireAcondicionado = new AireAcondicionado(1L, true);
		Bateria bateria = new Bateria(1L, 50d);
		Cinturones cinturones = new Cinturones(1L, 4);
		Puertas puertas = new Puertas(1L, 4);
		
		TanqueHidrogeno tanqueHidrogeno = new TanqueHidrogeno(1L, 755d);
			
		CocheHibrido cocheHibrido = new CocheHibrido(1L, "Lexus CT 200h", "Azul",bateria, cinturones, aireAcondicionado, puertas, tanqueHidrogeno);
		
		return cocheHibrido;
	}
	
	public static Coche creaCocheHibrido2() {
		AireAcondicionado aireAcondicionado = new AireAcondicionado(1L, true);
		Bateria bateria = new Bateria(1L, 335d);
		Cinturones cinturones = new Cinturones(1L, 25);
		Puertas puertas = new Puertas(1L, 4);
		
		TanqueHidrogeno tanqueHidrogeno = new TanqueHidrogeno(1L, 545d);
		
		CocheHibrido cocheHibrido = new CocheHibrido(2L, "Honda Jazz", "Rojo",bateria, cinturones, aireAcondicionado, puertas, tanqueHidrogeno);
		
		return cocheHibrido;
	}

}
