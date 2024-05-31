package com.pet.mapper;

import com.pet.entity.Lrecord;
import com.pet.entity.Pay;
import com.pet.entity.Register;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LpayMapper {

    int updPay(Register register);
    int addPay(Register register);
    List<Pay> selPays(Register register);
    List<Lrecord> selSurplus(Lrecord lrecord);
}
