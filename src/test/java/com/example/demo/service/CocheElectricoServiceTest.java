package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.example.demo.domain.CocheElectrico;
import com.example.demo.domain.piezas.AireAcondicionado;
import com.example.demo.domain.piezas.Bateria;
import com.example.demo.domain.piezas.BateriaElectrica;
import com.example.demo.domain.piezas.Cinturones;
import com.example.demo.domain.piezas.Puertas;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CocheElectricoServiceTest {

	private static CocheElectricoServiceImpl cocheElecService = new CocheElectricoServiceImpl();
    private static final Map<Long, CocheElectrico> cochesElec = cocheElecService.coches;
    
	@Test
	@Order(1)
	void testCount() {
		Integer cocheElec = cocheElecService.count();
		assertEquals(3, cocheElec);
	}

	@Test
	@Order(2)
	void testFindAll() {
		List<CocheElectrico> cochesElec = cocheElecService.findAll();
		assertEquals(cocheElecService.count(), cochesElec.size());
	}

	@Test
	@Order(3)
	void testFindOne() {
		Long id = 1L;
		
		CocheElectrico esperado = cochesElec.get(id);
		
		CocheElectrico resultado = cocheElecService.findOne(id);
		
		assertEquals(resultado, esperado);
	}

	@Test
	@Order(4)
	void testFindByName() {
		String modelo = "Model S";
				
		List<CocheElectrico> resultado = cocheElecService.findByName(modelo);
		
		assertEquals(1, resultado.size());
	}

	@Test
	@Order(5)
	void testFindCarColor() {
		String color = "Rojo";
				
		List<CocheElectrico> resultado = cocheElecService.findCarColor(color);	
		
		assertEquals(1,resultado.size());
	}

	@Test
	@Order(6)
	void testFindCarDoor() {
		Integer door = 4;
				
		List<CocheElectrico> resultado = cocheElecService.findCarDoor(door);
		
		assertNotEquals(1,resultado.size());
	}

	@Test
	@Order(8)
	void testSave() {
        CocheElectrico esperado = new CocheElectrico(4L, "Model S","Rojo", new Bateria(1L, 25d),new Cinturones(1L, 4),new AireAcondicionado(1L, true), new Puertas(1L, 4), new BateriaElectrica(1L, 355d));

        // 3. Verificar
        assertEquals(esperado, cocheElecService.save(esperado));
    }

	@Test
	@Order(7)
	void testDelete() {
		
		Long id = 1L;
				
		boolean resultado = cocheElecService.delete(id);
		
		assertTrue(resultado);
	}
	
	@Test
	@Order(11)
	void testDeleteNull() {
		
		Long id = null;
		
		CocheElectrico esperado = cochesElec.get(id);
		
		boolean resultado = cocheElecService.delete(id);
		
		assertFalse(resultado,"Es falso");
	}
	
	@Test
	@Order(12)
	void testDeleteNotFound() {
		
		Long id = 5L;
				
		boolean resultado = cocheElecService.delete(id);
		
		assertFalse(resultado,"No existe");
	}

	@Test
	@Order(13)
	void testDeleteAll() {
			
		cocheElecService.deleteAll();
		
		assertEquals(0,cochesElec.size());
	}

}
