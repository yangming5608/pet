package com.pet.service;

import com.pet.entity.Lcheckup;

import java.util.List;

public interface CheckupService {

    int addCheckup(Lcheckup lcheckup);
    int updPrice(Lcheckup lcheckup);
    List<Lcheckup> selCheckup(Lcheckup lcheckup);
}
