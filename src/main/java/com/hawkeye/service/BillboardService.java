package com.hawkeye.service;

import com.hawkeye.pojo.Movie;

import java.util.List;

public interface BillboardService {
    /**
     * 获取最受期待榜单
     * @return
     */
    List<Movie> getMostAnticipated();

    /**
     * 获取TOP榜数据
     * @return
     */
    List<Movie> getTOPBill(Integer displayNum);

    /**
     * 获取热映口碑榜数据
     * @return
     */
    List<Movie> getHeatWordOfMouth();
}
