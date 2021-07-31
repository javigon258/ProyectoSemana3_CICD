package com.example.demo.domain.piezas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BateriaTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testBateria() {
		Bateria bateria = new Bateria(3L,20d);
		bateria.setId(2L);
		bateria.setCapacidadBateria(25d);
		
		assertEquals(2L, bateria.getId());
		assertEquals(25d,bateria.getCapacidadBateria());	
	}

	@Test
	void testToString() {
		Bateria bateria = new Bateria(3L,20d);
		String expected = "";
        assertFalse(bateria.toString().matches(expected));
    }

}
