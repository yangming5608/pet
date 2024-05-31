package com.pet.service;

import com.pet.entity.Ban;
import com.pet.entity.Paiban;

import java.util.List;

public interface PaibanService {
    List<Paiban> findAllPaiban(Paiban paiban);
    int editPaiban(Paiban paiban);
    List<Ban> findAllBan();
    int insertPaiban(Paiban paiban);
    int count(Integer Id);
}
