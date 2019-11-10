package com.hawkeye.service.impl;

import com.hawkeye.mapper.PopularMapper;
import com.hawkeye.pojo.Popular;
import com.hawkeye.service.PopularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PopularServiceImpl implements PopularService {
    @Autowired
    PopularMapper popularMapper;

    /**
     * 获取所有热门数据
     * @return
     */
    @Override
    public List<Popular> getPopular() {
        return popularMapper.getPopular();
    }
}
