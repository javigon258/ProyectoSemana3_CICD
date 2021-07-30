package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.domain.Coche;
import com.example.demo.domain.CocheElectrico;
import com.example.demo.domain.CocheGasolina;
import com.example.demo.domain.CocheHibrido;
import com.example.demo.domain.piezas.AireAcondicionado;
import com.example.demo.domain.piezas.Bateria;
import com.example.demo.domain.piezas.BateriaElectrica;
import com.example.demo.domain.piezas.Cinturones;
import com.example.demo.domain.piezas.Puertas;

class CochesFacadeTest {
	

	@Test
	void testCreaCocheElectrico1() {	
		Coche coche = CochesFacade.creaCocheElectrico1();
		
		assertNotNull(coche);
		assertTrue(coche instanceof CocheElectrico);
		assertEquals(1L, coche.getId());
		
	}

	@Test
	void testCreaCocheElectrico2() {	
		Coche coche = CochesFacade.creaCocheElectrico2();
		
		assertNotNull(coche);
		assertTrue(coche instanceof CocheElectrico);
		assertEquals(2L, coche.getId());
		
	}

	@Test
	void testCreaCocheElectrico3() {	
		Coche coche = CochesFacade.creaCocheElectrico3();
		
		assertNotNull(coche);
		assertTrue(coche instanceof CocheElectrico);
		assertEquals(3L, coche.getId());
		
	}

	@Test
	void testCreaCocheGasolina1() {
		Coche coche = CochesFacade.creaCocheGasolina1();
		
		assertNotNull(coche);
		assertTrue(coche instanceof CocheGasolina);
		assertEquals(1L, coche.getId());	
	}

	@Test
	void testCreaCocheGasolina2() {
		Coche coche = CochesFacade.creaCocheGasolina2();
		
		assertNotNull(coche);
		assertTrue(coche instanceof CocheGasolina);
		assertEquals(2L, coche.getId());	
	}
	
	@Test
	void testCreaCocheHibrido1() {
		Coche coche = CochesFacade.creaCocheHibrido1();
		
		assertNotNull(coche);
		assertTrue(coche instanceof CocheHibrido);
		assertEquals(1L, coche.getId());	
	}
	
	@Test
	void testCreaCocheHibrido2() {
		Coche coche = CochesFacade.creaCocheHibrido2();
		
		assertNotNull(coche);
		assertTrue(coche instanceof CocheHibrido);
		assertEquals(2L, coche.getId());	
	}
}
