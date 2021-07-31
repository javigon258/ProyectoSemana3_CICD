package com.example.demo.domain.piezas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BateriaElectricaTest {

	@Test
	void testBateriaElectrica() {
		BateriaElectrica bateriaElectrica = new BateriaElectrica(2L, 15d);
		bateriaElectrica.setId(2L);
		bateriaElectrica.setVoltioMotor(25d);
		
		assertEquals(2L, bateriaElectrica.getId());
		assertEquals(25d,bateriaElectrica.getVoltioMotor());	
	}
		
	@Test
	void testToString() {
		BateriaElectrica bateriaElectrica = new BateriaElectrica(2L, 15d);
		String expected = "voltioMotor=[15d]*?"; 
	    assertFalse(bateriaElectrica.toString().matches(expected));
	}

}
