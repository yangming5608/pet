package com.pet.service;

import com.pet.entity.Skull;

import java.util.List;

public interface SkullService {
    //经办人的增删改查
    List<Skull> findAllSkull(Skull skull);
    int deleteSkull(Integer skullId);
    int addSkull(Skull skull);
    int editSkull(Skull skull);
}
