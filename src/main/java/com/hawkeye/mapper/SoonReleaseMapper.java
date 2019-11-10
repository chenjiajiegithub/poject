package com.hawkeye.mapper;


import com.hawkeye.pojo.SoonRelease;

import java.util.List;

/**
 * 电影中的即将上映
 */
public interface SoonReleaseMapper {
    /**
     * 获取即将上映的电影
     * @return
     */
    List<SoonRelease> getSoonRelease();
}
