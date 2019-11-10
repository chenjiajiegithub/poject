package com.hawkeye.mapper;

import com.hawkeye.pojo.Movie;

import java.util.List;

/**
 * 榜单
 */
public interface BillboardMapper {
    /**
     * 获取最受期待的榜单
     * @return
     */
    List<Movie> getMostAnticipated();

    /**
     * 获取TOP100榜单
     * @return
     */
    List<Movie> getTOPBill();

    /**
     * 获取热映口碑的榜单
     * @return
     */
    List<Movie> getHeatWordOfMouth();

}
