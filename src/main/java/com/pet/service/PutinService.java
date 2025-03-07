package com.pet.service;

import com.pet.entity.Drugdictionary;
import com.pet.entity.Drugstore;

import java.util.List;

public interface PutinService {
    //查询药品清单
    List<Drugdictionary> seldcy(Drugdictionary drugdictionary);
    //添加入库
    int adddrugstore(Drugstore drugstoreName);
    //查询药库是否已经存在药品名
    int seldrugname(Drugstore drugstore);
    int updrugnumber(Drugstore drugstore);
    //查询药品库存数量
    int selnumber(Drugstore drugstore);
}
