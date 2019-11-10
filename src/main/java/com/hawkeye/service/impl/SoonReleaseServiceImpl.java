package com.hawkeye.service.impl;

import com.hawkeye.mapper.SoonReleaseMapper;
import com.hawkeye.pojo.SoonRelease;
import com.hawkeye.service.SoonReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoonReleaseServiceImpl implements SoonReleaseService {

    @Autowired
    SoonReleaseMapper soonReleaseMapper;
    @Override
    public List<SoonRelease> getSoonRelease() {
        return soonReleaseMapper.getSoonRelease();
    }
}
