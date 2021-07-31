package com.example.demo.domain.piezas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AireAcondicionadoTest {

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Test
	void testAireAcondicionadoParam() {
		AireAcondicionado aire = new AireAcondicionado(3L,false);
		aire.setId(2L);
		aire.setTieneAire(true);
		
		assertEquals(2L, aire.getId());
		assertTrue(aire.isTieneAire());
	}


	@Test
	void testToString() {
		AireAcondicionado aire = new AireAcondicionado(3L,false);
        String expected = ""; 
        assertFalse(aire.toString().matches(expected));
    }

}
