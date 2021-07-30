package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.CocheGasolina;

public interface CocheGasolinaService {
	
    Integer count();

    List<CocheGasolina> findAll();

    CocheGasolina findOne(Long id);
    
    List<CocheGasolina> findByName(String name);
    
    List<CocheGasolina> findCarColor(String color);
    
    List<CocheGasolina> findCarDoor(int door);

    CocheGasolina save(CocheGasolina car);

    boolean delete(Long id);

    void deleteAll();

}
