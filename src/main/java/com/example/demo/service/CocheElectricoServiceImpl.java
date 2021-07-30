package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.domain.CocheElectrico;
import com.example.demo.domain.piezas.AireAcondicionado;
import com.example.demo.domain.piezas.Bateria;
import com.example.demo.domain.piezas.BateriaElectrica;
import com.example.demo.domain.piezas.Cinturones;
import com.example.demo.domain.piezas.Puertas;

@Service
public class CocheElectricoServiceImpl implements CocheElectricoService {
	
     final Map<Long, CocheElectrico> coches = new HashMap<>();

     public CocheElectricoServiceImpl (){
    	
		CocheElectrico coche1 = new CocheElectrico(1L, "Model S", "Rojo", new Bateria(1L, 25d),new Cinturones(1L, 4),new AireAcondicionado(1L, true), new Puertas(1L, 4), new BateriaElectrica(1L, 355d));
		CocheElectrico coche2 = new CocheElectrico(2L, "Renault ZERO", "Azul", new Bateria(2L, 215d),new Cinturones(1L, 5),new AireAcondicionado(1L, true), new Puertas(1L, 4), new BateriaElectrica(1L, 2335d));
		CocheElectrico coche3 = new CocheElectrico(3L, "Nissan Leaf", "Azul",new Bateria(3L, 555d),new Cinturones(1L, 3),new AireAcondicionado(1L, false), new Puertas(1L, 5), new BateriaElectrica(1L, 455d));

		coches.put(1L, coche1);
		coches.put(2L, coche2);
		coches.put(3L, coche3);
    }

    @Override
    public Integer count() {
        return coches.keySet().size();
    }

	@Override
	public List<CocheElectrico> findAll() {
		 return new ArrayList(coches.values());
	}

	@Override
	public CocheElectrico findOne(Long id) {
		return coches.get(id);
	}
	
	@Override
	public List<CocheElectrico> findByName(String name) {
		List<CocheElectrico> results = new ArrayList<>();
		for(CocheElectrico coche : coches.values())
			if(coche.getModelo().equals(name))
				results.add(coche);
		return results;
	}
	
	@Override
	public List<CocheElectrico> findCarColor(String color) {
		List<CocheElectrico> results = new ArrayList<>();
		for(CocheElectrico coche : coches.values())
			if(coche.getColor().equals(color))
				results.add(coche);
		return results;
	}
	
	@Override
	public List<CocheElectrico> findCarDoor(int door) {
		ArrayList<CocheElectrico> results = new ArrayList<>();
		for(Map.Entry<Long, CocheElectrico> entry : coches.entrySet()) {
			if(entry.getValue().getPuertas().getNumPuertas() == door) {
				results.add(entry.getValue());
			}
		}
		return results;
	}


	@Override
	public CocheElectrico save(CocheElectrico car) {
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
