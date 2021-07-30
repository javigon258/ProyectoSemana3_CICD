package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.example.demo.domain.CocheGasolina;
import com.example.demo.domain.piezas.AireAcondicionado;
import com.example.demo.domain.piezas.Bateria;
import com.example.demo.domain.piezas.Cinturones;
import com.example.demo.domain.piezas.MotorGasolina;
import com.example.demo.domain.piezas.Puertas;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CocheGasolinaServiceImplTest {

	private static CocheGasolinaServiceImpl cocheGasoliService = new CocheGasolinaServiceImpl();
    private static final Map<Long, CocheGasolina> cocheGas = cocheGasoliService.coches;

	
	@Test
	@Order(1)
	void testCount() {
		Integer cocheGasTotal = cocheGasoliService.count();
		assertEquals(3, cocheGasTotal);
	}

	@Test
	@Order(2)
	void testFindAll() {
		List<CocheGasolina> cochesGasolina = cocheGasoliService.findAll();
		assertEquals(cocheGasoliService.count(), cochesGasolina.size());
	}

	@Test
	@Order(3)
	void testFindOne() {
		Long id = 1L;
		
		CocheGasolina esperado = cocheGas.get(id);
		
		CocheGasolina resultado = cocheGasoliService.findOne(id);
		
		assertEquals(resultado, esperado);
	}

	@Test
	@Order(4)
	void testFindByName() {
		String modelo = "Peugeot 208";
				
		List<CocheGasolina> resultado = cocheGasoliService.findByName(modelo);
		
		assertEquals(1, resultado.size());
	}

	@Test
	@Order(5)
	void testFindCarColor() {
		String color = "Rojo";
				
		List<CocheGasolina> resultado = cocheGasoliService.findCarColor(color);	
		
		assertEquals(1,resultado.size());
	}

	@Test
	@Order(6)
	void testFindCarDoor() {
		Integer door = 4;
				
		List<CocheGasolina> resultado = cocheGasoliService.findCarDoor(door);
		
		assertEquals(1,resultado.size());
	}

	@Test
	@Order(7)
	void testSave() {
        CocheGasolina esperado = new CocheGasolina(4L, "Peugeot 208", "Rojo", new Bateria(2L, 215d),new Cinturones(1L, 5),new AireAcondicionado(1L, true), new Puertas(1L, 4), new MotorGasolina(1L, 215d));

        // 3. Verificar
        assertEquals(esperado, cocheGasoliService.save(esperado));
    }

	@Test
	@Order(8)
	void testDelete() {
		
		Long id = 1L;
				
		boolean resultado = cocheGasoliService.delete(id);
		
		assertTrue(resultado);
		
		
	}
	
	@Test
	@Order(9)
	void testDeleteNull() {
		
		Long id = null;
				
		boolean resultado = cocheGasoliService.delete(id);
		
		assertFalse(resultado,"Es falso");
	}
	
	@Test
	@Order(10)
	void testDeleteNotFound() {
		
		Long id = 5L;
		
		boolean resultado = cocheGasoliService.delete(id);
		
		assertFalse(resultado,"No existe");
	}
	@Test
	@Order(11)
	void testDeleteAll() {
			
		cocheGasoliService.deleteAll();
		
		assertEquals(0,cocheGas.size());
	}

}
