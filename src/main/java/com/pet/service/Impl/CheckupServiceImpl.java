package com.pet.service.Impl;

import com.pet.entity.Lcheckup;
import com.pet.mapper.CheckupMapper;
import com.pet.service.CheckupService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CheckupServiceImpl implements CheckupService {

    @Resource
    private CheckupMapper checkupMapper;

    @Override
    public int addCheckup(Lcheckup lcheckup) {
        return checkupMapper.addCheckup(lcheckup);
    }

    @Override
    public int updPrice(Lcheckup lcheckup) {
        return checkupMapper.updPrice(lcheckup);
    }

    @Override
    public List<Lcheckup> selCheckup(Lcheckup lcheckup) {
        return checkupMapper.selCheckup(lcheckup);
    }
}
