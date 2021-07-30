package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.CocheElectrico;

public interface CocheElectricoService {
	
    Integer count();

    List<CocheElectrico> findAll();

    CocheElectrico findOne(Long id);
    
    List<CocheElectrico> findByName(String name);

    List<CocheElectrico> findCarColor(String color);
    
    List<CocheElectrico> findCarDoor(int door);

    CocheElectrico save(CocheElectrico car);

    boolean delete(Long id);

    void deleteAll();

}
