package com.pet.service.Impl;

import com.pet.entity.Area;
import com.pet.mapper.AreaMapper;
import com.pet.service.AreaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class AreaServiceImpl implements AreaService {
    @Resource
    private AreaMapper areaMapper;
    @Override
    public List<Area> findAllArea(Area area) {
        return areaMapper.findAllArea(area);
    }

    @Override
    public int deleteArea(Integer areaId) {
        return areaMapper.deleteArea(areaId);
    }

    @Override
    public int addArea(Area area) {
        return areaMapper.addArea(area);
    }


    @Override
    public int count(Area area) {
        return areaMapper.count(area);
    }
}
