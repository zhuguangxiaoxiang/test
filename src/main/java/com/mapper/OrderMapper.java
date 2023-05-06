package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entiy.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2023/5/6
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    List<Order> getOrderList(@Param("page") int page, @Param("pers") int pers);
    int getOrderCount();
    List<Order> getLastOrderList();
}
