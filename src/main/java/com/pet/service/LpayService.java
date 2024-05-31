package com.pet.service;

import com.pet.entity.Lrecord;
import com.pet.entity.Pay;
import com.pet.entity.Register;

import java.util.List;

public interface LpayService {

    int updPay(Register register);
    int addPay(Register register);
    List<Pay> selPays(Register register);
    List<Lrecord> selSurplus(Lrecord lrecord);
}
