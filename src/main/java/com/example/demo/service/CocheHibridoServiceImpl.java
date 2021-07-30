package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.domain.CocheHibrido;
import com.example.demo.domain.piezas.AireAcondicionado;
import com.example.demo.domain.piezas.Bateria;
import com.example.demo.domain.piezas.Cinturones;
import com.example.demo.domain.piezas.Puertas;
import com.example.demo.domain.piezas.TanqueHidrogeno;

@Service
public class CocheHibridoServiceImpl implements CocheHibridoService {
	
    final Map<Long, CocheHibrido> coches = new HashMap<>();

    public CocheHibridoServiceImpl(){
    	
    	CocheHibrido coche1 = new CocheHibrido(1L, "Honda Jazz", "Azul", new Bateria(2L, 215d),new Cinturones(1L, 5),new AireAcondicionado(1L, true), new Puertas(1L, 4), new TanqueHidrogeno(1L, 115d));
		CocheHibrido coche2 = new CocheHibrido(2L, "Hyundai Ioniq", "Azul", new Bateria(6L, 115d),new Cinturones(1L, 5),new AireAcondicionado(1L, false), new Puertas(1L, 5), new TanqueHidrogeno(1L, 852d));
		CocheHibrido coche3 = new CocheHibrido(3L, "Lexus CT 200h", "Rojo", new Bateria(2L, 625d),new Cinturones(1L, 4),new AireAcondicionado(1L, false), new Puertas(1L, 3), new TanqueHidrogeno(1L, 232d));

		coches.put(1L, coche1);
		coches.put(2L, coche2);
		coches.put(3L, coche3);
    }

    @Override
    public Integer count() {
        return coches.keySet().size();
    }

	@Override
	public List<CocheHibrido> findAll() {
		 return new ArrayList<>(coches.values());
	}

	@Override
	public CocheHibrido findOne(Long id) {
		return coches.get(id);
	}
	
	@Override
	public List<CocheHibrido> findByName(String name) {
		List<CocheHibrido> results = new ArrayList<>();
		for(CocheHibrido coche : coches.values())
			if(coche.getModelo().equals(name))
				results.add(coche);
		return results;
	}
		
	@Override
	public List<CocheHibrido> findCarColor(String color) {
		List<CocheHibrido> results = new ArrayList<>();
		for(CocheHibrido coche : coches.values())
			if(coche.getColor().equals(color))
				results.add(coche);
		return results;
	}

	@Override
	public List<CocheHibrido> findCarDoor(int door) {
		ArrayList<CocheHibrido> results = new ArrayList<>();
		for(Map.Entry<Long, CocheHibrido> entry : coches.entrySet()) {
			if(entry.getValue().getPuertas().getNumPuertas() == door) {
				results.add(entry.getValue());
			}
		}
		return results;
	}
		
	@Override
	public CocheHibrido save(CocheHibrido car) {
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
