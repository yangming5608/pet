package com.pet.service;

import com.pet.entity.Type;

import java.util.List;

public interface TypeService {
    //类型的增删查改
    List<Type> findAllType(Type type);
    int deleteType(Integer typeId);
    int addType(Type type);
    int count(Type type);
}
