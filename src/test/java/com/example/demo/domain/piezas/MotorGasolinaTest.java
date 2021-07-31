package com.example.demo.domain.piezas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MotorGasolinaTest {

	@Test
	void testMotorGasolina() {
		MotorGasolina motor = new MotorGasolina(3L,20d);
		motor.setId(2L);
		motor.setEficet95(25d);
		
		assertEquals(2L, motor.getId());
		assertEquals(25d,motor.getEficet95());	
	}

	@Test
	void testToString() {
		MotorGasolina motor = new MotorGasolina(3L,20d);
		String expected = "3L,20d"; // put the expected value here
        assertTrue(motor.toString().matches(expected));
    }
}
