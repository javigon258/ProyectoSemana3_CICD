package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.domain.CocheGasolina;
import com.example.demo.domain.piezas.AireAcondicionado;
import com.example.demo.domain.piezas.Bateria;
import com.example.demo.domain.piezas.Cinturones;
import com.example.demo.domain.piezas.MotorGasolina;
import com.example.demo.domain.piezas.Puertas;

@Service
public class CocheGasolinaServiceImpl implements CocheGasolinaService {
	
    final Map<Long, CocheGasolina> coches = new HashMap<>();

    public CocheGasolinaServiceImpl(){
    	
    	CocheGasolina coche1 = new CocheGasolina(1L, "Renault Megane", "Azul" ,new Bateria(1L, 25d),new Cinturones(1L, 4),new AireAcondicionado(1L, true), new Puertas(1L, 3), new MotorGasolina(1L, 155d));
		CocheGasolina coche2 = new CocheGasolina(2L, "Peugeot 208", "Rojo", new Bateria(2L, 215d),new Cinturones(1L, 5),new AireAcondicionado(1L, true), new Puertas(1L, 4), new MotorGasolina(1L, 215d));
		CocheGasolina coche3 = new CocheGasolina(3L, "Seat León", "Verde", new Bateria(3L, 565d),new Cinturones(1L, 3),new AireAcondicionado(2L, false), new Puertas(1L, 5), new MotorGasolina(1L, 655d));

		coches.put(1L, coche1);
		coches.put(2L, coche2);
		coches.put(3L, coche3);
    }

    @Override
    public Integer count() {
        return coches.keySet().size();
    }

	@Override
	public List<CocheGasolina> findAll() {
		 return new ArrayList<>(coches.values());
	}

	@Override
	public CocheGasolina findOne(Long id) {
		return coches.get(id);
	}
	
	@Override
	public List<CocheGasolina> findByName(String name) {
		List<CocheGasolina> results = new ArrayList<>();
		for(CocheGasolina coche : coches.values())
			if(coche.getModelo().equals(name))
				results.add(coche);
		return results;
	}
		

	@Override
	public List<CocheGasolina> findCarColor(String color) {
		List<CocheGasolina> results = new ArrayList<>();
		for(CocheGasolina coche : coches.values())
			if(coche.getColor().equals(color))
				results.add(coche);
		return results;
	}
	
	@Override
	public List<CocheGasolina> findCarDoor(int door) {
		ArrayList<CocheGasolina> results = new ArrayList<>();
		for(Map.Entry<Long, CocheGasolina> entry : coches.entrySet()) {
			if(entry.getValue().getPuertas().getNumPuertas() == door) {
				results.add(entry.getValue());
			}
		}
		return results;
	}
	
	@Override
	public CocheGasolina save(CocheGasolina car) {
        if (car.getId() == null || car.getId() == 0L) {
        	car.setId(getMaxCocheElecId() + 1); 
        }

        coches.remove(car.getId()); 

        coches.put(car.getId(),car);
        return car;
	}
	
    private Long getMaxCocheElecId() {
    	if (coches.isEmpty()) {
    		return 0L;
    	}
        return Collections.max(coches.entrySet(),
                (entry1, entry2) -> (int) (entry1.getKey() - entry2.getKey())
        ).getKey();
    }

	@Override
	public boolean delete(Long id) {
		if(id == null || !coches.containsKey(id))
			return false;
		coches.remove(id);
		return true;
	}

	@Override
	public void deleteAll() {
		if(!coches.isEmpty())
			coches.clear();
		
	}

}
