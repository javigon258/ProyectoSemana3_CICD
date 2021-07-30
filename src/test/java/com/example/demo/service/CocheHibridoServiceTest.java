package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.example.demo.domain.CocheElectrico;
import com.example.demo.domain.CocheHibrido;
import com.example.demo.domain.piezas.AireAcondicionado;
import com.example.demo.domain.piezas.Bateria;
import com.example.demo.domain.piezas.Cinturones;
import com.example.demo.domain.piezas.Puertas;
import com.example.demo.domain.piezas.TanqueHidrogeno;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CocheHibridoServiceTest {

	private static CocheHibridoServiceImpl cocheHibridoService = new CocheHibridoServiceImpl();
    private static final Map<Long, CocheHibrido> cochesHibrid = cocheHibridoService.coches;

	
	@Test
	@Order(1)
	void testCount() {
		Integer cocheHib = cocheHibridoService.count();
		assertEquals(3, cocheHib);
	}

	@Test
	@Order(2)
	void testFindAll() {
		List<CocheHibrido> cocheHib = cocheHibridoService.findAll();
		assertEquals(cocheHibridoService.count(), cocheHib.size());
	}

	@Test
	@Order(3)
	void testFindOne() {
		Long id = 1L;
		
		CocheHibrido esperado = cochesHibrid.get(id);
		
		CocheHibrido resultado = cocheHibridoService.findOne(id);
		
		assertEquals(resultado, esperado);
	}

	@Test
	@Order(4)
	void testFindByName() {
		String modelo = "Hyundai Ioniq";
				
		List<CocheHibrido> resultado = cocheHibridoService.findByName(modelo);
		
		assertEquals(1, resultado.size());
	}

	@Test
	@Order(5)
	void testFindCarColor() {
		String color = "Azul";
				
		List<CocheHibrido> resultado = cocheHibridoService.findCarColor(color);	
		
		assertEquals(2,resultado.size());
	}

	@Test
	@Order(6)
	void testFindCarDoor() {
		Integer door = 4;
				
		List<CocheHibrido> resultado = cocheHibridoService.findCarDoor(door);
		
		assertEquals(1,resultado.size());
	}

	@Test
	@Order(7)
	void testSave() {
        CocheHibrido esperado = new CocheHibrido(4L, "Lexus CT 200h", "Rojo", new Bateria(2L, 625d),new Cinturones(1L, 4),new AireAcondicionado(1L, false), new Puertas(1L, 3), new TanqueHidrogeno(1L, 232d));

        // 3. Verificar
        assertEquals(esperado, cocheHibridoService.save(esperado));
    }

	@Test
	@Order(8)
	void testDelete() {
		
		Long id = 1L;
				
		boolean resultado = cocheHibridoService.delete(id);
		
		assertTrue(resultado);
		
		
	}
	
	@Test
	@Order(9)
	void testDeleteNull() {
		
		Long id = null;
		
		boolean resultado = cocheHibridoService.delete(id);
		
		assertFalse(resultado,"Es falso");
	}
	
	@Test
	@Order(10)
	void testDeleteNotFound() {
		
		Long id = 5L;
				
		boolean resultado = cocheHibridoService.delete(id);
		
		assertFalse(resultado,"No existe");
	}
	@Test
	@Order(11)
	void testDeleteAllEmpty() {
		cocheHibridoService.deleteAll();
		
		assertEquals(0,cochesHibrid.size());
	}
}
