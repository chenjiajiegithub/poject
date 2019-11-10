package com.hawkeye.service;


import com.hawkeye.pojo.SoonRelease;

import java.util.List;

public interface SoonReleaseService {
    /**
     * 获取即将上映的电音
     * @return
     */
    List<SoonRelease> getSoonRelease();
}
