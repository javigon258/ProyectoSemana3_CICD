package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.CocheHibrido;

public interface CocheHibridoService {
	
    Integer count();

    List<CocheHibrido> findAll();

    CocheHibrido findOne(Long id);
    
    List<CocheHibrido> findByName(String name);
    
    List<CocheHibrido> findCarColor(String color);
    
    List<CocheHibrido> findCarDoor(int door);
    
    CocheHibrido save(CocheHibrido car);

    boolean delete(Long id);

    void deleteAll();

}
