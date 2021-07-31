package com.example.demo.domain.piezas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CinturonesTest {

	@Test
	void testCinturones() {
		Cinturones cinturon = new Cinturones(2L, 5);
		cinturon.setId(2L);
		cinturon.setNumCinturones(2);
		
		assertEquals(2L, cinturon.getId());
		assertEquals(2,cinturon.getNumCinturones());	
	}
		
	@Test
	void testToString() {
		Cinturones cinturon = new Cinturones(2L, 5);
		String expected = "numCinturones=[1-6]*?"; // put the expected value here
	    assertFalse(cinturon.toString().matches(expected));
	}

}
