package com.example.demo.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.domain.piezas.AireAcondicionado;
import com.example.demo.domain.piezas.Bateria;
import com.example.demo.domain.piezas.BateriaElectrica;
import com.example.demo.domain.piezas.Cinturones;
import com.example.demo.domain.piezas.MotorGasolina;
import com.example.demo.domain.piezas.Puertas;
import com.example.demo.domain.piezas.TanqueHidrogeno;

class CocheTest {

	Coche coches = new Coche() {
		AireAcondicionado aire = new AireAcondicionado(3L,false);
		BateriaElectrica bateriaElectrica = new BateriaElectrica(2L, 15d);
		Bateria bateria = new Bateria(3L,20d);
		Cinturones cinturon = new Cinturones(2L, 5);
		MotorGasolina motor = new MotorGasolina(3L,20d);
		Puertas puerta = new Puertas(2L, 5);
		TanqueHidrogeno tanqueH = new TanqueHidrogeno(2L, 15d);
	};
	
	@Test
	void testCocheLongStringStringBateriaCinturonesAireAcondicionadoPuertas() {
		AireAcondicionado aire = new AireAcondicionado(2L,false);
		Bateria bateria = new Bateria(1L,20d);
		Cinturones cinturon = new Cinturones(1L, 5);
		Puertas puerta = new Puertas(1L, 5);
		coches.setAire(aire);
		coches.setBateria(bateria);
		coches.setCinturones(cinturon);
		coches.setPuertas(puerta);
		coches.setId(1L);
		coches.setModelo("Ford");
		coches.setColor("Rojo");

		assertEquals(1L, coches.getId());
		assertEquals("Ford", coches.getModelo());
		assertEquals("Rojo", coches.getColor());
		assertEquals(aire, coches.getAire());
		assertEquals(bateria, coches.getBateria());
		assertEquals(cinturon, coches.getCinturones());
		assertEquals(puerta, coches.getPuertas());

	}

	@Test
	void testToString() {

		String expected = "";
        assertFalse(coches.toString().matches(expected));
    }

}
