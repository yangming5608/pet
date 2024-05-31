package com.pet.service.Impl;

import com.pet.entity.Drugdictionary;
import com.pet.entity.Drugstore;
import com.pet.mapper.PutinMapper;
import com.pet.service.PutinService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PutinServiceImpl implements PutinService {

    @Resource
    private PutinMapper sm;
       @Override
    public List<Drugdictionary> seldcy(Drugdictionary drugdictionary) {
        return sm.seldcy(drugdictionary);
    }



   @Override
    public int adddrugstore(Drugstore drugstoreName) {
        return sm.adddrugstore(drugstoreName);
    }

    @Override
    public int seldrugname(Drugstore drugstore) {
        return sm.seldrugname(drugstore);
    }

    @Override
    public int updrugnumber(Drugstore drugstore) {
        return sm.updrugnumber(drugstore);
    }

    @Override
    public int selnumber(Drugstore drugstore) {
        return sm.selnumber(drugstore);
    }

}
