package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.domain.Coche;
import com.example.demo.domain.CocheElectrico;
import com.example.demo.domain.CocheGasolina;
import com.example.demo.domain.CocheHibrido;

class CocheFactoryTest {
	
	@Test
	@DisplayName("Metodo que comprueba si el tipo coche es electrico")
	void testCreaCocheTipoElect() {
		
		String tipo = "electrico";
				
		Coche comp = CocheFactory.creaCocheTipo(tipo);
		
		assertNotNull(comp);
		
		assertTrue(comp instanceof CocheElectrico);
		
	}
	
	@Test
	@DisplayName("Metodo que comprueba si el tipo coche es hidrogeno")
	void testCreaCocheTipoHibrid() {
		
		String tipo = "hidrogeno";
				
		Coche comp = CocheFactory.creaCocheTipo(tipo);
		
		assertNotNull(comp);
		
		assertTrue(comp instanceof CocheHibrido);
	}
	
	@Test
	@DisplayName("Metodo que comprueba si el tipo coche es gasolina")
	void testCreaCocheTipoGasol() {
		
		String tipo = "gasolina";
				
		Coche comp = CocheFactory.creaCocheTipo(tipo);
		
		assertNotNull(comp);

		assertTrue(comp instanceof CocheGasolina);
	}
	
	@Test
	@DisplayName("Metodo que comprueba si no es ninguno de los 3 tipos de coche")
	void testCreaCocheTipoDefault() {
		
		String tipo = "notexists";
						
		// 2. ejecucion del codigo a testear
		Exception exception = assertThrows(
				IllegalArgumentException.class, 
				() -> CocheFactory.creaCocheTipo(tipo)
				);
		
		assertEquals("Unexpected value: notexists", exception.getMessage());

	}

}
