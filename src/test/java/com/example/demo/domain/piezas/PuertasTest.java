package com.example.demo.domain.piezas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PuertasTest {

	@Test
	void testPuertas() {
		Puertas puerta = new Puertas(2L, 5);
		puerta.setId(2L);
		puerta.setNumPuertas(6);
		
		assertEquals(2L, puerta.getId());
		assertEquals(6,puerta.getNumPuertas());	
	}
		
	@Test
	void testToString() {
		Puertas puerta = new Puertas(2L, 5);
		String expected = "numPuertas=[1-6]*?";
	    assertFalse(puerta.toString().matches(expected));
	}
}
