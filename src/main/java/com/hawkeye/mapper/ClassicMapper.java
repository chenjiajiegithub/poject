package com.hawkeye.mapper;


import com.hawkeye.pojo.Popular;

import java.util.List;

/**
 * 电影中的经典电影
 */
public interface ClassicMapper {
    /**
     * 获取所有经典影片
     * @return
     */
    List<Popular> getClassic();

}
