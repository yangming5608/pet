package com.pet.service;

import com.pet.entity.Area;
import com.pet.entity.Sdrugdictionary;
import com.pet.entity.Type;
import com.pet.entity.Unit;
import com.pet.mapper.SdrugdictionaryMapper;

import java.util.List;

public interface SdrugdictionaryService {
    List<SdrugdictionaryMapper> findAllSdrugdictionary(Sdrugdictionary sdrugdictionary);
    int addSdrugdictionary(Sdrugdictionary sdrugdictionary);
    int editSdrugdictionary(Sdrugdictionary sdrugdictionary);
    int deleteSdrugdictionary(Integer drugId);
    List<Unit> findAllUnit();
    List<Area> findAllArea();
    List<Type> findAllType();
    int count(Sdrugdictionary sdrugdictionary);
}
